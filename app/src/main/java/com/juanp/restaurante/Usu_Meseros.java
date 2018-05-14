package com.juanp.restaurante;

public class Usu_Meseros {

    public Integer id_usu_mesero;
    public String mese_nombre, mese_apellido, mese_email, mese_contra;

    public Integer getId_usu_mesero() {
        return id_usu_mesero;
    }

    public void setId_usu_mesero(Integer id_usu_mesero) {
        this.id_usu_mesero = id_usu_mesero;
    }

    public String getMese_nombre() {
        return mese_nombre;
    }

    public void setMese_nombre(String mese_nombre) {
        this.mese_nombre = mese_nombre;
    }

    public String getMese_apellido() {
        return mese_apellido;
    }

    public void setMese_apellido(String mese_apellido) {
        this.mese_apellido = mese_apellido;
    }

    public String getMese_email() {
        return mese_email;
    }

    public void setMese_email(String mese_email) {
        this.mese_email = mese_email;
    }

    public String getMese_contra() {
        return mese_contra;
    }

    public void setMese_contra(String mese_contra) {
        this.mese_contra = mese_contra;
    }

    public Usu_Meseros(Integer id_usu_mesero, String mese_nombre, String mese_apellido, String mese_email, String mese_contra) {
        this.id_usu_mesero = id_usu_mesero;
        this.mese_nombre = mese_nombre;
        this.mese_apellido = mese_apellido;
        this.mese_email = mese_email;
        this.mese_contra = mese_contra;
    }
}
