package com.ulatina.grupo5.modelo;

public class Usuarios {

    public int cedula;
    public String paasword;
    public String correo;
    public String nombre;
    public String apellido1;
    public String appellido2;
    public int TipoUsuario;

    public Usuarios(int cedula, String paasword, String correo, String nombre, String apellido1, String appellido2, int TipoUsuario) {
        this.cedula = cedula;
        this.paasword = paasword;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.appellido2 = appellido2;
        this.TipoUsuario = TipoUsuario;
    }

    public Usuarios() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPaasword() {
        return paasword;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getAppellido2() {
        return appellido2;
    }

    public void setAppellido2(String appellido2) {
        this.appellido2 = appellido2;
    }

    public int getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(int TipoUsuario) {
        this.TipoUsuario = TipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "cedula=" + cedula + ", paasword=" + paasword + ", correo=" + correo + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", appellido2=" + appellido2 + ", TipoUsuario=" + TipoUsuario + '}';
    }

}
