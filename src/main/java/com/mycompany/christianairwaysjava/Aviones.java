/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.christianairwaysjava;

/**
 *
 * @author chris
 */
public class Aviones {
     private String marca;
     private String compañia;
     private Integer motores;
     private String modelo;
     private String uso;
    
    public Aviones(String marca,String compañia, Integer motores,String modelo, String uso){
        this.marca=marca;
        this.compañia=compañia;
        this.motores=motores;
        this.modelo=modelo;
        this.uso=uso;
    }
    public String getMarca(){
    return "La marca es "+ marca;
    }
    public void setMarca(String marca){
        this.marca= marca;
    }
    public String getCompañia(){
    return "La compañía que opera es "+ compañia;
    }
    public void setCompañia(String compañia){
        this.compañia= compañia;
    }
    public String getMotores(){
    return "Nº de motores "+ motores;
    }
    public void setMotores(int motores){
        this.motores= motores;
    }
    public String getModelo(){
    return "El modelo es el "+ modelo;
    }
    public void setModelo(String modelo){
        this.modelo= modelo;
    }
    public String getUso(){
    return "Este avión está destinado al transporte de "+ uso;
    }
    public void set(String uso){
        this.uso= uso;
    }
}
