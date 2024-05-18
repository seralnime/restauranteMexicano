package com.restauranteMexicano.App.Controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.restauranteMexicano.App.JavaMappers.PedidoMapper;
import com.restauranteMexicano.App.Servicios.ServicioPedidoImpl;
import com.restauranteMexicano.App.model.Pedido;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

@RestController
@RequestMapping("/Pedido")
public class PedidoController {
 
    @Autowired
    private PedidoMapper pedidoMapper;

    @Autowired
    private ServicioPedidoImpl servicioPedidoImpl;

    public PedidoController(PedidoMapper pedidoMapper) {
        this.pedidoMapper = pedidoMapper;
    }

    @GetMapping("/ConsultarPedidos")
    public List<Pedido> ConsultarPedidos(){
        return servicioPedidoImpl.ConsultarPedidos();
    }

    @PostMapping("/CrearPedido")
    public ResponseEntity<Pedido> CrearPedido(@RequestBody Pedido pedido){
        pedidoMapper.CrearPedido(pedido);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }

    
    @GetMapping("/ConsultarPedido/{id}")
    public Pedido ConsultarPedido(@PathVariable("id") Integer id){
        return servicioPedidoImpl.ConsultarPedido(id);
    }

    @DeleteMapping("/EliminarPedido/{id}")
    public ResponseEntity<String> EliminarPedido(@PathVariable("id") Integer id){
        pedidoMapper.EliminarPedido(id);
        return ResponseEntity.ok("Pedido eliminado correctamente");
    }
    

}
