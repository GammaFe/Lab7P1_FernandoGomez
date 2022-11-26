
package com.mycompany.lab7p1_fernandogomez;


public class avion {
    public String modelo;
    public String codigo;
    public int año;
    public int pasajeros;
    public int peso;

    public avion(){
    }
    
    public avion(String modelo, String codigo, int año, int pasajeros, int peso) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.año = año;
        this.pasajeros = pasajeros;
        this.peso = peso;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}

