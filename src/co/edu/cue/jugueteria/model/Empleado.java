package co.edu.cue.jugueteria.model;

public class Empleado extends Usuario {
    private double salario;
    private String fechaIngreso;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(String nombre, String cedula, String telefono, String direccionR, double salario, String fechaIngreso) {
        super(nombre, cedula, telefono, direccionR);
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }
}
