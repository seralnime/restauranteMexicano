package com.restauranteMexicano.App.JavaMappers;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.PathVariable;

import com.restauranteMexicano.App.model.Producto;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */  
@Mapper
public interface ProductoMapper {

    @Select("select * from T_PRODUCTOS")
    List<Producto> ConsultarProductos();

    @Select("select * from T_PRODUCTOS where ID =#{ID}")
    Producto ConsultarProducto(@PathVariable("ID") Integer ID);

    @Insert("INSERT INTO T_PRODUCTOS (Nombre, Descripcion, Cantidad, Precio, Ingredientes, TieneDescuento) VALUES (#{Nombre}, #{Descripcion}, #{Cantidad}, #{Precio}, #{Ingredientes}, #{TieneDescuento})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "ID",
            before = false, resultType = Integer.class)
    void CrearProducto(Producto producto);

    @Delete("delete from T_PRODUCTOS where ID = #{ID}")
    void EliminarProducto(@PathVariable("ID") Integer ID);

    @Update("UPDATE T_PRODUCTOS SET Precio = #{Precio}, Cantidad = #{Cantidad}, TieneDescuento = #{TieneDescuento} WHERE ID = #{ID}")
    void ActualizarProducto(Producto producto);

    @Select("SELECT p.Id AS ID, p.Nombre, p.Descripcion, pp.Cantidad,p.Precio, p.Ingredientes, p.TieneDescuento FROM T_PRODUCTOS p JOIN T_PEDIDO_PRODUCTO pp ON p.Id = pp.ProductoID JOIN T_PEDIDOS pe ON pe.ID = pp.PedidoID WHERE pe.ID = 1;")
    List<Producto> ConsultarProductoPorPedido(@PathVariable("ID") Integer ID);
}