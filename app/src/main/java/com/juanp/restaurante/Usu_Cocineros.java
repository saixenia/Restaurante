package com.juanp.restaurante;

public class Usu_Cocineros {

    public Integer id_usu_cocinero;
    public String coci_nombre, coci_apellido, coci_email, coci_contra;

    public Integer getId_usu_cocinero() {
        return id_usu_cocinero;
    }

    public void setId_usu_cocinero(Integer id_usu_cocinero) {
        this.id_usu_cocinero = id_usu_cocinero;
    }

    public String getCoci_nombre() {
        return coci_nombre;
    }

    public void setCoci_nombre(String coci_nombre) {
        this.coci_nombre = coci_nombre;
    }

    public String getCoci_apellido() {
        return coci_apellido;
    }

    public void setCoci_apellido(String coci_apellido) {
        this.coci_apellido = coci_apellido;
    }

    public String getCoci_email() {
        return coci_email;
    }

    public void setCoci_email(String coci_email) {
        this.coci_email = coci_email;
    }

    public String getCoci_contra() {
        return coci_contra;
    }

    public void setCoci_contra(String coci_contra) {
        this.coci_contra = coci_contra;
    }

    public Usu_Cocineros(Integer id_usu_cocinero, String coci_nombre, String coci_apellido, String coci_email, String coci_contra) {
        this.id_usu_cocinero = id_usu_cocinero;
        this.coci_nombre = coci_nombre;
        this.coci_apellido = coci_apellido;
        this.coci_email = coci_email;
        this.coci_contra = coci_contra;
    }
}
