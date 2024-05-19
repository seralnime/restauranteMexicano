package com.restauranteMexicano.App.Servicios;

import java.util.List;

import com.restauranteMexicano.App.model.Producto;

public interface ServicioProducto {
    List<Producto> ConsultarProductos();

    Producto ConsultarProducto(Integer id);

    void ActualizarProducto(Producto producto);
    
}
