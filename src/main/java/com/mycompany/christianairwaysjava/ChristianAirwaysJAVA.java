/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.christianairwaysjava;

/**
 *
 * @author chris
 */
public class ChristianAirwaysJAVA {

    public static void main(String[] args) {
   
        Aviones BomardierCrj200 = new Aviones("Bombardier","Christian Airways",2,"crj200","pasajeros");
        Aviones Saab340B = new Aviones("Saab","Loganair",2,"340B","pasajeros");
        Aviones SaabTp100 = new Aviones("Saab","Loganair",2,"Tp100","pasajeros");
        Aviones Boeing748 = new Aviones("Saab","Ryanair",4,"747-800","pasajeros");
        Aviones Boeing738 = new Aviones("Saab","Ryanair",2,"737-800","pasajeros");
        Aviones G700 = new Aviones("Gulfstream","Diego",2,"G700","pasajeros VIP");
        Aviones Bombardier8000 = new Aviones("Bombardier","Amr",2,"GLOBAL 8000","pasajeros VIP");
        
        System.out.println(Saab340B.getMotores());
                
    
    }
}
