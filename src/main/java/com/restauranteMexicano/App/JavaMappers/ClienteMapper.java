package com.restauranteMexicano.App.JavaMappers;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

import com.restauranteMexicano.App.model.Cliente;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */  
@Mapper
public interface ClienteMapper {

    @Select("select * from T_CLIENTES")
    List<Cliente> ConsultarClientes();

    @Select("select * from T_CLIENTES where ID =#{id}")
    List<Cliente> ConsultarCliente(@PathVariable("id") Integer id);

    @Insert("insert into T_CLIENTES(ID, nombre, Licencia, Direccion) VALUES (#{ID}, #{nombre}, #{Licencia}, #{Direccion})")
    void CrearCliente(Cliente cliente);

    @Delete("delete from T_CLIENTES where ID = #{id}")
    void EliminarCliente(@PathVariable("id") Integer id);

}


 