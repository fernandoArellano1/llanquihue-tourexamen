package app;

import model.Cliente;
import model.Registrable;
import data.GestorArchivos;
import utils.RutInvalidoException;
import model.Direccion;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal (App) que ejecuta el prototipo de Llanquihue Tour.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println(" SISTEMA LLANQUIHUE TOUR - INICIANDO...");
        System.out.println("========================================\n");

        // 1. Uso de Colecciones e Interfaces (Lista polimórfica)
        List<Registrable> baseDeDatos = new ArrayList<>();

        // 2. Cargar datos DESDE EL ARCHIVO TXT REAL
        // Asegúrate de que "datos.txt" esté en la raíz de tu proyecto
        ArrayList<Cliente> clientesCargados = GestorArchivos.cargarClientesDesdeTXT("datos.txt");
        baseDeDatos.addAll(clientesCargados);

        // 3. Probar la validación de excepciones (RUT incorrecto)
        System.out.println("--- PROBANDO VALIDACIÓN DE ERRORES ---");
        try {
            Direccion dirPrueba = new Direccion("Prueba", "0", "Llanquihue");
            Cliente clienteMalo = new Cliente("123", "Pedro", dirPrueba, "pedro@mail.com");
            baseDeDatos.add(clienteMalo);
        } catch (RutInvalidoException e) {
            System.out.println("ALERTA CAPTURADA: " + e.getMessage() + "\n");
        }

        // 4. Recorrer la colección mostrando datos
        System.out.println("--- MOSTRANDO REGISTROS (USANDO INSTANCEOF) ---");
        for (Registrable registro : baseDeDatos) {
            if (registro instanceof Cliente) {
                registro.registrar();
                registro.mostrarDatos();
                System.out.println("-");
            }
        }

        // 5. Función de Búsqueda / Filtro (Requisito del examen)
        System.out.println("\n--- FILTRANDO CLIENTES DE LA CIUDAD 'Llanquihue' ---");
        for (Registrable registro : baseDeDatos) {
            if (registro instanceof Cliente) {
                Cliente c = (Cliente) registro; // Casteo
                // Filtramos accediendo a la Composición (Dirección)
                if (c.getDireccion().getCiudad().equalsIgnoreCase("Llanquihue")) {
                    System.out.println("Encontrado: " + c.getNombre() + " vive en Llanquihue.");
                }
            }
        }
    }
}