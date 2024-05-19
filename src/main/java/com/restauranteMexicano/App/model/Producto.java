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
public class Producto {
    private int ID;
    private String Nombre;
    private String Descripcion;
    private int Cantidad;
    private Float Precio;
    private String Ingredientes;
    private Boolean tieneDescuento;

    public Producto() {
    }

    public Producto(int ID, String nombre, String descripcion, int Cantidad, Float precio, String ingredientes, Boolean tieneDescuento) {
        this.ID = ID;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Cantidad = Cantidad;
        this.Precio = precio;
        this.Ingredientes = ingredientes;
        this.tieneDescuento = tieneDescuento;
    }
}