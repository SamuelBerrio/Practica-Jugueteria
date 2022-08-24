package co.edu.cue.jugueteria.services;

import co.edu.cue.jugueteria.model.Cliente;
import co.edu.cue.jugueteria.model.Empleado;

public interface UsuarioService {
    public abstract Cliente agregarCliente(String nombre,String cedula,String telefono,String direccionR,String birthday,String correo);
    public abstract Empleado agregarEmpleado(String nombre, String cedula, String telefono, String direccionR,double salario,String fechaIngreso);
}
