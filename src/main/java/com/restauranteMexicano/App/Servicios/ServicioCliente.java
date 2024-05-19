package com.restauranteMexicano.App.Servicios;

import com.restauranteMexicano.App.model.Cliente;

public interface ServicioCliente {
    Boolean LicenciaValida(String licencia);
    Cliente consultarCliente(Integer clienteID);
}
