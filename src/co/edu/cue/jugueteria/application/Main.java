package co.edu.cue.jugueteria.application;

import co.edu.cue.jugueteria.controllers.JugueteController;
import co.edu.cue.jugueteria.controllers.UsuarioController;
import co.edu.cue.jugueteria.controllers.VentaController;
import co.edu.cue.jugueteria.model.*;
import co.edu.cue.jugueteria.services.impl.JugueteServiceImpl;
import co.edu.cue.jugueteria.services.impl.VentaServiceImpl;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //Arrays
        Cliente[] clientes = new Cliente[20];
        int clientesCont = 0;
        Empleado[] empleados = new Empleado[5];
        int empleadoCont = 0;
        Juguete[] juguetes = new Juguete[100];
        int jugueteCont = 0;
        Venta[] ventas = new Venta[100];
        int ventaCont = 0;

        int des;

        do{
            des = Integer.parseInt(JOptionPane.showInputDialog(Menu.menuPrincipal));
            switch (des) {
                case 1:
                    switch (Integer.parseInt(JOptionPane.showInputDialog(Menu.menu2))) {
                        case 1:
                            UsuarioController empleado = new UsuarioController();
                            empleado.agregarEmpleado(empleados, empleadoCont);
                            System.out.println("El empleado " + empleados[empleadoCont].getNombre() + " ha sido ingresad@ con exito");
                            empleadoCont++;
                            break;
                        case 2:
                            UsuarioController cliente = new UsuarioController();
                            cliente.agregarCliente(clientes, clientesCont);
                            System.out.println("El cliente " + clientes[clientesCont].getNombre() + " ha sido ingresad@ con exito");
                            clientesCont++;
                            break;
                    }
                    break;
                case 2:
                    JugueteController juguete = new JugueteController();
                    juguete.agregarJuguete(juguetes, jugueteCont);
                    System.out.println("Juguete " + juguetes[jugueteCont].getNombre() + " ha sido ingresado con exito");
                    jugueteCont++;
                    break;
                case 3:
                    VentaController ventaService = new VentaController();
                    DetalleVenta[] detalles = new DetalleVenta[10];
                    int des3;
                    int detalleCont = 0;
                    do {
                        des3 = Integer.parseInt(JOptionPane.showInputDialog(Menu.menu3));
                        switch (des3) {
                            case 1:
                                ventaService.agregarVenta(ventas,ventaCont,clientes,empleados,detalles);
                                ventaCont++;
                                break;
                            case 2:
                                if(detalleCont<11){
                                    ventaService.agregarDetalle(juguetes,detalleCont,detalles);
                                    detalleCont++;
                                }else {
                                    System.out.println("Ya se llego al maximo de jugetes por venta");
                                }
                                break;
                        }
                    } while (des3 != 0);
                    break;
                case 4:
                    JugueteServiceImpl jugueteService = new JugueteServiceImpl();
                    int des4 = Integer.parseInt(JOptionPane.showInputDialog(Menu.menu4));
                    switch (des4){
                        case 1:
                            JOptionPane.showMessageDialog(null,jugueteService.juguetesPorCategoria(juguetes));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null,"El total de juguetes en el inventario es: "+jugueteService.totalJuguetes(juguetes));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"El valor total de los juguetes es de: "+jugueteService.valorTotal(juguetes));

                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null,"El material con mas juguetes es "+jugueteService.categoriaMasJuguetes(juguetes));
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null,"El material con menos juguetes es "+jugueteService.categoriaMenosJuguetes(juguetes));
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null,jugueteService.valorMayorA(juguetes));
                            break;
                    }
                    break;
            }
        }while (des!=0);

    }
}
