package co.edu.cue.jugueteria.model;

public class Venta {
    private String fechaVenta;
    private int juguetesVendidos;
    private Cliente cliente;
    private Empleado empleado;
    private double descuento;
    private double total;
    private DetalleVenta juguetesVenta[];

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getJuguetesVendidos() {
        return juguetesVendidos;
    }

    public void setJuguetesVendidos(int juguetesVendidos) {
        this.juguetesVendidos = juguetesVendidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public DetalleVenta[] getJuguetesVenta() {
        return juguetesVenta;
    }

    public void setJuguetesVenta(DetalleVenta[] juguetesVenta) {
        this.juguetesVenta = juguetesVenta;
    }

    public Venta(String fechaVenta, int juguetesVendidos, Cliente cliente, Empleado empleado, double descuento, double total, DetalleVenta[] juguetesVenta) {
        this.fechaVenta = fechaVenta;
        this.juguetesVendidos = juguetesVendidos;
        this.cliente = cliente;
        this.empleado = empleado;
        this.descuento = descuento;
        this.total = total;
        this.juguetesVenta = juguetesVenta;
    }
}
