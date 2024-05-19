package com.restauranteMexicano.App.model;

import lombok.Data;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */
@Data
public class Cliente {

    private String nombre;
    private Integer ID;
    private String Licencia;
    private String Direccion;

    
    public Cliente(){

    }
    public Cliente(String nombre, Integer ID, String Licencia, String Direccion){
        this.nombre = nombre;
        this.ID = ID;
        this.Licencia = Licencia;
        this.Direccion = Direccion;
    }
}