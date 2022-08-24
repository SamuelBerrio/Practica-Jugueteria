package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.VentaService;

public class VentaServiceImpl implements VentaService {
    @Override
    public DetalleVenta añadirJuguete(Juguete juguete, int cantidad) {
        return new DetalleVenta(juguete,cantidad);
    }

    @Override
    public Venta añadirVenta(String fechaVenta, int juguetesVendidos, Cliente cliente, Empleado empleado, double descuento, double total, DetalleVenta[] juguetesVenta) {
        return new Venta(fechaVenta, juguetesVendidos, cliente, empleado, descuento, total, juguetesVenta);
    }
}
