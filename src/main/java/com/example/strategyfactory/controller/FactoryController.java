package com.example.strategyfactory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.strategyfactory.enums.FormatStrategyEnum;
import com.example.strategyfactory.formatFactory.FormatFactory;

@RestController
public class FactoryController {
    
	@Autowired
	FormatFactory formatFactory ;

	@GetMapping("/format")
	public void formatSomething(@RequestParam FormatStrategyEnum formatStrategyEnum){

		formatFactory.findFormatStrategy(formatStrategyEnum).format(new Object());
	
	} 

}
