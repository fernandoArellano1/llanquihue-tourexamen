package model;

/**
 * Clase abstracta principal. Aplica herencia e implementa la interfaz Registrable.
 */
public abstract class Persona implements Registrable {
    private String rut;
    private String nombre;
    private Direccion direccion; // AQUÍ APLICAMOS COMPOSICIÓN (Una clase dentro de otra)

    public Persona(String rut, String nombre, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Getters y Setters (Encapsulamiento)
    public String getRut() { return rut; }
    public String getNombre() { return nombre; }
    public Direccion getDireccion() { return direccion; }

    @Override
    public String toString() {
        return "RUT: " + rut + " | Nombre: " + nombre + " | Dirección: " + direccion.toString();
    }
}