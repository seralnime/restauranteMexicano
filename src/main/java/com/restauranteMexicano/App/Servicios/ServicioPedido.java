package com.restauranteMexicano.App.Servicios;

import java.util.List;

import com.restauranteMexicano.App.model.Pedido;

public interface ServicioPedido {
    List<Pedido> ConsultarPedidos();

    Pedido ConsultarPedido(Integer id);

    void CrearPedido(Pedido pedido);
}

