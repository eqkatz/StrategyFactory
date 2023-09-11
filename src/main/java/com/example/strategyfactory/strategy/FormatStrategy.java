package com.example.strategyfactory.strategy;

import com.example.strategyfactory.enums.FormatStrategyEnum;


public interface FormatStrategy {
    
    public void format (Object toBoMapped);
    
    public FormatStrategyEnum getFormatStrategy();

}
