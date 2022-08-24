package co.edu.cue.jugueteria.controllers;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.impl.UsuarioServiceImpl;

import javax.swing.*;

public class UsuarioController {
  UsuarioServiceImpl usuario = new UsuarioServiceImpl();
    public void agregarCliente(Cliente[] array, int clienteCont){
        String nombreC = JOptionPane.showInputDialog("Ingrese nombre de el Cliente");
        String cedulaC = JOptionPane.showInputDialog("Ingrese cedula de el Cliente");
        String telefonoC = JOptionPane.showInputDialog("Ingrese telefono de el Cliente");
        String direccionRC = JOptionPane.showInputDialog("Ingrese direccion de residencia de el Cliente");
        String birthdayC = JOptionPane.showInputDialog("Ingrese fecha de cumpleaños de el Cliente");
        String correoC = JOptionPane.showInputDialog("Ingrese correo de el Cliente");
        array[clienteCont]= usuario.agregarCliente(nombreC,cedulaC,telefonoC,direccionRC,birthdayC,correoC);
    }

  public void agregarEmpleado(Empleado[] array,int EmpleadoCont){
        String nombreE = JOptionPane.showInputDialog("Ingrese nombre de el Empleado");
      String cedulaE = JOptionPane.showInputDialog("Ingrese cedula de el Empleado");
      String telefonoE = JOptionPane.showInputDialog("Ingrese telefono de el Empleado");
      String direccionRE = JOptionPane.showInputDialog("Ingrese direccion de residencia de el Empleado");
      double salarioE = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario de el Empleado"));
      String fechaIngresoE = JOptionPane.showInputDialog("Ingrese la fecha de ingreso de el Empleado");
      array[EmpleadoCont] = usuario.agregarEmpleado(nombreE,cedulaE,telefonoE,direccionRE,salarioE,fechaIngresoE);
  }

}
