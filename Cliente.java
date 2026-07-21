package model;
import utils.RutInvalidoException;

/**
 * Clase hija que hereda de Persona. Representa a un cliente de Llanquihue Tour.
 */
public class Cliente extends Persona {
    private String email;

    // El constructor lanza nuestra excepción personalizada si el RUT es corto
    public Cliente(String rut, String nombre, Direccion direccion, String email) throws RutInvalidoException {
        super(rut, nombre, direccion);

        if (rut == null || rut.length() < 8) {
            throw new RutInvalidoException("El RUT ingresado (" + rut + ") es inválido.");
        }
        this.email = email;
    }

    @Override
    public void registrar() {
        System.out.println("-> Registrando cliente en el sistema: " + getNombre());
    }

    @Override
    public void mostrarDatos() {
        System.out.println(super.toString() + " | Email: " + email);
    }
}