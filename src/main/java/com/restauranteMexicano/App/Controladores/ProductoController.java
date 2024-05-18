package com.restauranteMexicano.App.Controladores;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.restauranteMexicano.App.JavaMappers.ProductoMapper;
import com.restauranteMexicano.App.model.Producto;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

@RestController
@RequestMapping("/Producto")
public class ProductoController {
 
    private ProductoMapper productoMapper;


    public ProductoController(ProductoMapper productoMapper) {
        this.productoMapper = productoMapper;
    }

    @GetMapping("/ConsultarProductos")
    public List<Producto> ConsultarProductos(){
        return productoMapper.ConsultarProductos();
    }

    @PostMapping("/CrearProducto")
    public ResponseEntity<Producto> CrearProducto(@RequestBody Producto producto){
        productoMapper.CrearProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(producto);
    }

    
    @GetMapping("/ConsultarProducto/{id}")
    public Producto ConsultarProducto(@PathVariable("id") Integer id){
        return productoMapper.ConsultarProducto(id);
    }

    @DeleteMapping("/EliminarProducto/{id}")
    public ResponseEntity<String> EliminarProducto(@PathVariable("id") Integer id){
        productoMapper.EliminarProducto(id);
        return ResponseEntity.ok("Producto eliminado correctamente");
    }

    @PutMapping("/ActualizarProducto")
    public ResponseEntity<Producto> ActualizarProducto(@RequestBody Producto producto){
        productoMapper.ActualizarProducto(producto);
        return ResponseEntity.status(HttpStatus.CREATED).body(producto);
    }
    
    @GetMapping("/ConsultarProductoPorPedido")
    public List<Producto> ConsultarProductoPorPedido(@PathVariable("ID") Integer ID){
        return productoMapper.ConsultarProductoPorPedido(ID);
    }

}
