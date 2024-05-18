package com.restauranteMexicano.App.DTO;


import lombok.Data;

@Data
public class PedidoDTO {

    private int ID;
    private int ClienteID;
    private float total;
    private boolean PagoHecho;
    private float tarifaDomicilio;

}
