package co.edu.cue.jugueteria.model;

public class DetalleVenta {
    private Juguete juguete;
    private int cantidad;

    public Juguete getJuguete() {
        return juguete;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public DetalleVenta(Juguete juguete, int cantidad) {
        this.juguete = juguete;
        this.cantidad = cantidad;
    }
}
