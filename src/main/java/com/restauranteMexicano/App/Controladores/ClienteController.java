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
import org.springframework.http.HttpStatus;

import com.restauranteMexicano.App.JavaMappers.ClienteMapper;
import com.restauranteMexicano.App.model.Cliente;

@RestController
@RequestMapping("/Cliente")
public class ClienteController {
 
    private ClienteMapper clienteMapper;

    
    public ClienteController(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    @GetMapping("/ConsultarClientes")
    public List<Cliente> ConsultarClientes(){
        return clienteMapper.ConsultarClientes();
    }

    @PostMapping("/CrearCliente")
    public ResponseEntity<Cliente> CrearCliente(@RequestBody Cliente cliente){
        clienteMapper.CrearCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    
    @GetMapping("/ConsultarCliente/{id}")
    public List<Cliente> ConsultarCliente(@PathVariable("id") Integer id){
        return clienteMapper.ConsultarCliente(id);
    }

    @DeleteMapping("/EliminarCliente/{id}")
    public ResponseEntity<String> EliminarCliente(@PathVariable("id") Integer id){
        clienteMapper.EliminarCliente(id);
        return ResponseEntity.ok("Cliente eliminado correctamente");
    }
    

}
