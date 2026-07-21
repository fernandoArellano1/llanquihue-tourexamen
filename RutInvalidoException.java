package utils;

/**
 * Excepción personalizada para validar que el RUT ingresado sea correcto.
 * Cumple con el requerimiento de validación de atributos.
 */
public class RutInvalidoException extends Exception {
    public RutInvalidoException(String mensaje) {
        super(mensaje);
    }
}