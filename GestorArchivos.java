package data;

import model.Cliente;
import model.Direccion;
import utils.RutInvalidoException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Clase utilitaria para manejar la lectura de datos desde un archivo .txt
 */
public class GestorArchivos {

    public static ArrayList<Cliente> cargarClientesDesdeTXT(String rutaArchivo) {
        ArrayList<Cliente> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("--- LEYENDO ARCHIVO DE DATOS ---");

            // Leemos línea por línea el TXT
            while ((linea = br.readLine()) != null) {
                // Separamos los datos por las comas
                String[] datos = linea.split(",");

                // Extraemos los datos para armar la composición
                String rut = datos[0];
                String nombre = datos[1];
                Direccion dir = new Direccion(datos[2], datos[3], datos[4]); // Composición
                String email = datos[5];

                // Creamos el cliente y lo agregamos a la lista
                Cliente nuevoCliente = new Cliente(rut, nombre, dir, email);
                lista.add(nuevoCliente);
            }
            System.out.println("Datos cargados exitosamente.\n");

        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lista;
    }
}