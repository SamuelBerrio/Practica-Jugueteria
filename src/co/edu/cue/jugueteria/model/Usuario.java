package co.edu.cue.jugueteria.model;

import co.edu.cue.jugueteria.controllers.UsuarioController;

public class Usuario extends UsuarioController {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccionR;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccionR() {
        return direccionR;
    }

    public void setDireccionR(String direccionR) {
        this.direccionR = direccionR;
    }

    public Usuario(String nombre, String cedula, String telefono, String direccionR) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccionR = direccionR;
    }
}
