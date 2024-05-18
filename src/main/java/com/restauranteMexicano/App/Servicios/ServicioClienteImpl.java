package com.restauranteMexicano.App.Servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restauranteMexicano.App.Controladores.ClienteController;

@Service
public class ServicioClienteImpl implements ServicioCliente{

    @Autowired
    ClienteController clienteController;

    @Override
    public Boolean LicenciaValida(String licencia) {
        Boolean licenciaValida = clienteController.ConsultarLicencia(licencia);
        if (licenciaValida == null){
            return false;
        }else{
            return licenciaValida;
        }
    }

}
