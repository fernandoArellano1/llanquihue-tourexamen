package model;

/**
 * Clase que representa una dirección. Se usará como "Composición" dentro de Persona.
 */
public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;

    public Direccion(String calle, String numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }

    // Getters
    public String getCiudad() { return ciudad; }

    @Override
    public String toString() {
        return calle + " #" + numero + ", " + ciudad;
    }
}