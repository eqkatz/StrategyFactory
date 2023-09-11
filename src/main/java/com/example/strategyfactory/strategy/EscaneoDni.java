package com.example.strategyfactory.strategy;

import org.springframework.stereotype.Service;

import com.example.strategyfactory.enums.FormatStrategyEnum;

@Service
public class EscaneoDni implements FormatStrategy{

    @Override
    public void format(Object toBoMapped) {
        System.out.println("Estoy implementando el mappeo de un Escaneo de DNI");
    }

    @Override
    public FormatStrategyEnum getFormatStrategy() {
        return FormatStrategyEnum.ESCANEO_DNI;
    }
    
}
