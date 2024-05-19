package com.restauranteMexicano.App.model;
import java.util.List;

import lombok.Data;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

@Data
public class Pedido {
    private int ID;
    private Cliente cliente;
    private List<Producto> productos;
    private Float total;

    public Pedido(Cliente cliente, List<Producto> productos, Float total) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = total;
    }
    
    public Pedido(){}


}
