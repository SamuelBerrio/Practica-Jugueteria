package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.*;

public interface VentaService {
    public abstract DetalleVenta añadirJuguete(Juguete juguete, int cantidad);
    public abstract Venta añadirVenta(String fechaVenta, int juguetesVendidos, Cliente cliente, Empleado empleado, double descuento, double total, DetalleVenta[] juguetesVenta);
}
