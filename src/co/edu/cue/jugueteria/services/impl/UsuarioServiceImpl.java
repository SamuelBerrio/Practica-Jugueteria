package co.edu.cue.jugueteria.services.impl;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;
import co.edu.cue.jugueteria.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
    @Override
    public Cliente agregarCliente(String nombre, String cedula, String telefono, String direccionR, String birthday, String correo) {
        return new Cliente(nombre,cedula,telefono,direccionR,birthday,correo);
    }

    @Override
    public Empleado agregarEmpleado(String nombre, String cedula, String telefono, String direccionR, double salario, String fechaIngreso) {
        return new Empleado(nombre,cedula,telefono,direccionR,salario,fechaIngreso);
    }
}
