package com.restauranteMexicano.App.model;
import java.util.List;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */


public class Pedido {
    private int ID;
    private Cliente cliente;
    private List<Producto> productos;
    private Float total;
    private Boolean PagoHecho;
    private Float tarifaDomicilio;


    public Pedido(int ID, Cliente cliente, List<Producto> productos, Boolean esPremium) {
        this.ID = ID;
        this.cliente = cliente;
        this.productos = productos;
        this.total = calculaPago(esPremium);
    }
    public Pedido(Cliente cliente, List<Producto> productos, Boolean esPremium) {
        this.cliente = cliente;
        this.productos = productos;
        this.total = calculaPago(esPremium);
    }
    public Pedido(){}
    
    
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public Float calculaPago(Boolean esPremium){
        if(!esPremium){
            this.tarifaDomicilio = 3500f;
        } else {
            this.tarifaDomicilio = 0f;
        }
        Float totalP = 0f;
        for (Producto producto : this.productos) {
            totalP += producto.getPrecio() * producto.getCantidad();
        }
        totalP += this.tarifaDomicilio;
        return totalP;
    }


    public Float getTarifaDomicilio() {
        return tarifaDomicilio;
    }
    public void setTarifaDomicilio(Float tarifaDomicilio) {
        this.tarifaDomicilio = tarifaDomicilio;
    }
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Float getTotal() {
        return this.total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }
    public Boolean getPagoHecho() {
        return this.PagoHecho;
    }

    public void setPagoHecho(Boolean pagoHecho) {
        this.PagoHecho = pagoHecho;
    }

}
