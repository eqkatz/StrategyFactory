package com.example.strategyfactory.strategy;

import org.springframework.stereotype.Service;

import com.example.strategyfactory.enums.FormatStrategyEnum;

@Service
public class AltaUsuario implements FormatStrategy{

    @Override
    public void format(Object toBoMapped) {
        System.out.println("Estoy implementando el mappeo de un Alta de Usuario");
    }

    @Override
    public FormatStrategyEnum getFormatStrategy() {
        return FormatStrategyEnum.ALTA_USUARIO;
    }
    
}
