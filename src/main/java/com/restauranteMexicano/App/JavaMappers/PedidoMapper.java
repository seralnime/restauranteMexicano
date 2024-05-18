package com.restauranteMexicano.App.JavaMappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.web.bind.annotation.PathVariable;

import com.restauranteMexicano.App.DTO.PedidoDTO;
import com.restauranteMexicano.App.model.Pedido;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */  
@Mapper
public interface PedidoMapper {

    @Select("select * from T_PEDIDOS")
    List<PedidoDTO> ConsultarPedidos();

    @Select("select * from T_PEDIDOS where ID =#{id}")
    PedidoDTO ConsultarPedido(@PathVariable("id") Integer id);

    @Insert("INSERT INTO T_PEDIDOS (ClienteID, total, PagoHecho, tarifaDomicilio) VALUES (#{ID}, #{total}, #{PagoHecho}, #{tarfiaDomicilio})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "ID",
            before = false, resultType = Integer.class)
    void CrearPedido(Pedido pedido);

    @Delete("delete from T_PEDIDOS where ID = #{id}")
    void EliminarPedido(@PathVariable("id") Integer id);

}


 