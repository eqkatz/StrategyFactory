package com.example.strategyfactory.strategy;

import org.springframework.stereotype.Service;

import com.example.strategyfactory.enums.FormatStrategyEnum;

@Service
public class SolicitudAlta implements FormatStrategy{

    @Override
    public void format(Object toBoMapped) {
        System.out.println("Estoy implementando el mappeo de una Solicitud de Alta");
    }

    @Override
    public FormatStrategyEnum getFormatStrategy() {
        return FormatStrategyEnum.SOLICITUD_ALTA;
    }
    
}
