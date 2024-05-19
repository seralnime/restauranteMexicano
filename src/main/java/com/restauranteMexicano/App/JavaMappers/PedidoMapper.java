package com.restauranteMexicano.App.JavaMappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.restauranteMexicano.App.DTO.PedidoDTO;


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
    PedidoDTO ConsultarPedido(@Param("id") Integer id);

    @Insert("INSERT INTO T_PEDIDOS (ClienteID, total, tarifaDomicilio) VALUES (#{ClienteID}, #{total}, #{tarifaDomicilio})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "ID",
            before = false, resultType = Integer.class)
    void CrearPedido(PedidoDTO pedidoDTO);

    @Select("SELECT LAST_INSERT_ID()")
    int UltimoID();

    @Insert("INSERT INTO T_PEDIDO_PRODUCTO (PedidoID, ProductoID, Cantidad) VALUES (#{pedidoID}, #{productoID}, #{cantidad})")
    void insertarPedidoProducto(@Param("pedidoID") int pedidoID, @Param("productoID") int productoID, @Param("cantidad") int cantidad);

}


 