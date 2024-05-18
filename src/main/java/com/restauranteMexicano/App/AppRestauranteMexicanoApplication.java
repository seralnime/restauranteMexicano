package com.restauranteMexicano.App;

import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.restauranteMexicano.App.model.Cliente;

@SpringBootApplication
@MapperScan(basePackages = "com.restauranteMexicano.App.JavaMappers")
@MappedTypes({Cliente.class})
public class AppRestauranteMexicanoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppRestauranteMexicanoApplication.class, args);
	}

}
