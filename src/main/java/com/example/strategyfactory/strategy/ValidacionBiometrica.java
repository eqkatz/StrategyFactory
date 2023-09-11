package com.example.strategyfactory.strategy;

import org.springframework.stereotype.Service;

import com.example.strategyfactory.enums.FormatStrategyEnum;

@Service
public class ValidacionBiometrica implements FormatStrategy{

    @Override
    public void format(Object toBoMapped) {
        System.out.println("Estoy implementando el mappeo de una Validacion Biometrica");
    }

    @Override
    public FormatStrategyEnum getFormatStrategy() {
        return FormatStrategyEnum.VALIDACION_BIOMETRICA;
    }
    
}
