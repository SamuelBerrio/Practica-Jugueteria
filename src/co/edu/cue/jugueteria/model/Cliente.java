package co.edu.cue.jugueteria.model;

import co.edu.cue.jugueteria.services.UsuarioService;

public class Cliente extends Usuario {
    private String birthday;
    private String correo;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Cliente(String nombre, String cedula, String telefono, String direccionR, String birthday, String correo) {
        super(nombre, cedula, telefono, direccionR);
        this.birthday = birthday;
        this.correo = correo;
    }
}
