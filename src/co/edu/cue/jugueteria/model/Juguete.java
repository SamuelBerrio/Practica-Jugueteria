package co.edu.cue.jugueteria.model;

public class Juguete {
    private String nombre;
    private String material;
    private double precio;
    private int existencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Juguete(String nombre, String material, double precio, int existencia) {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
        this.existencia = existencia;
    }
}
