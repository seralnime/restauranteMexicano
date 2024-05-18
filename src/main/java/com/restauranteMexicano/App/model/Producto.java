package com.restauranteMexicano.App.model;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

public class Producto {
    private int ID;
    private String Nombre;
    private String Descripcion;
    private int Cantidad;

    private Float Precio;
    private String Ingredientes;
    private Boolean TieneDescuento;

    public Producto() {
    }

    public Producto(int ID, String nombre, String descripcion, int Cantidad, Float precio, String ingredientes, Boolean TieneDescuento) {
        this.ID = ID;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Cantidad = Cantidad;
        this.Precio = precio;
        this.Ingredientes = ingredientes;
        this.TieneDescuento = TieneDescuento;
    }
    
    public int getID() {
        return this.ID;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public int getCantidad() {
        return this.Cantidad;
    }   

    public Float getPrecio() {
        return this.Precio;
    }

    public String getIngredientes() {
        return this.Ingredientes;
    }

    public Boolean getTieneDescuento() {
        return TieneDescuento;
    }

    public void setId(int ID) {
        this.ID = ID;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public void setPrecio(Float precio) {
        this.Precio = precio;
    }

    public void setIngredientes(String ingredientes) {
        this.Ingredientes = ingredientes;
    }

    public void setTieneDescuento(Boolean tieneDescuento) {
        TieneDescuento = tieneDescuento;
    }
}