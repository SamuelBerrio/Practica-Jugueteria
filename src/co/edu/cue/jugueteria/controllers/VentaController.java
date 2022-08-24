package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.impl.VentaServiceImpl;

import javax.swing.*;
import java.util.Objects;

public class VentaController {
    VentaServiceImpl ventaService = new VentaServiceImpl();
    public void agregarDetalle(Juguete[] juguetes, int detalleCont,DetalleVenta[] detalleVentas){
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de el Juguete que desea añadir a la venta");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
        for (Juguete juguete : juguetes) {
            if (String.valueOf(juguete)!="null"){
                if (nombre.equals(String.valueOf(juguete.getNombre()))) {
                    if (cantidad < juguete.getExistencia()) {
                        int nuevaExistencia = juguete.getExistencia() - cantidad;
                        juguete.setExistencia(nuevaExistencia);
                        detalleVentas[detalleCont] = ventaService.añadirJuguete(juguete, cantidad);
                        System.out.println(juguete.getNombre() + " añadido a la venta exitosamente");
                        System.out.println("Existencias actuales de el juguete " + juguete.getNombre() + " = " + juguete.getExistencia());
                    } else {
                        System.out.println("Cantidad invalida (Mayor a las existencias)");
                    }
                }
            }
        }
    }

    public void agregarVenta(Venta[]ventas,int ventaCont,Cliente[] clientes, Empleado[] empleados, DetalleVenta[] detalleVentas){
        String fechaVenta = JOptionPane.showInputDialog("Ingrese fecha de venta");
        String nombreC = JOptionPane.showInputDialog("Ingrese nombre de el Cliente que realizo la compra");
        String nombreE = JOptionPane.showInputDialog("Ingrese nombre de el Empleado encargado de la venta");
        double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingresar porcentaje de descuento"));
        double total = 0;
        int juguetesVendidos = 0;
        for (Cliente cliente:clientes){
            if(String.valueOf(cliente)!="null"){
                if (nombreC.equals(cliente.getNombre())){
                    for (Empleado empleado:empleados){
                        if(String.valueOf(empleado)!="null"){
                            if(nombreE.equals(empleado.getNombre())){
                                for(DetalleVenta detalle : detalleVentas){
                                    if(String.valueOf(detalle)!="null"){
                                        total = total + (detalle.getJuguete().getPrecio()*detalle.getCantidad());
                                        juguetesVendidos+=detalle.getCantidad();
                                    }
                                }
                                total = total - (total*(descuento/100));
                                ventas[ventaCont]=ventaService.añadirVenta(fechaVenta,juguetesVendidos,cliente,empleado,descuento,total,detalleVentas);
                                System.out.println("Venta Realizada con exito: \n" +
                                        "Empleado: "+empleado.getNombre()+"\n" +
                                        "Cliente: "+cliente.getNombre()+"\n" +
                                        "Fecha: "+ventas[ventaCont].getFechaVenta()+"\n" +
                                        "Descuento: "+ventas[ventaCont].getDescuento()+"% \n" +
                                        "Total: "+ventas[ventaCont].getTotal()+" $ \n" +
                                        "Juguetes en total: "+ventas[ventaCont].getJuguetesVendidos());
                            }
                        }
                    }
                }
            }
        }
    }
}
