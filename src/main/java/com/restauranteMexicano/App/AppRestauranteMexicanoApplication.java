package com.restauranteMexicano.App;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restauranteMexicano.App.model.Pedido;
import com.restauranteMexicano.App.model.Cliente;
import com.restauranteMexicano.App.model.Producto;

/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

@SpringBootApplication
@MapperScan(basePackages = "com.restauranteMexicano.App.JavaMappers")
@MappedTypes({Cliente.class, Producto.class, Pedido.class})
public class AppRestauranteMexicanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRestauranteMexicanoApplication.class, args);
	}

}
