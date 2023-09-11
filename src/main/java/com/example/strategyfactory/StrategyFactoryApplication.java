package com.example.strategyfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.strategyfactory.enums.FormatStrategyEnum;
import com.example.strategyfactory.formatFactory.FormatFactory;

@SpringBootApplication
public class StrategyFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrategyFactoryApplication.class, args);

		
	}

}
