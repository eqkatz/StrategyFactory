package com.example.strategyfactory.formatFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.strategyfactory.enums.FormatStrategyEnum;
import com.example.strategyfactory.strategy.FormatStrategy;

@Component
public class FormatFactory {
    
    Map<FormatStrategyEnum, FormatStrategy> formatMap;

    @Autowired
    public FormatFactory(Set<FormatStrategy> formatTypesSet){
        createStrategyMap(formatTypesSet);
        prinStrategytMap();
    }

    private void prinStrategytMap() {
        this.formatMap.forEach((key, value) -> System.out.println("KEY: " + key + " - VALUE: " + value));
    }

    private void createStrategyMap(Set<FormatStrategy> formatTypesSet) {
        formatMap = new HashMap<FormatStrategyEnum, FormatStrategy>();
        formatTypesSet.stream()
                .forEach(formatType -> 
                    formatMap.put(formatType.getFormatStrategy(), formatType)
                );
                
    }

    public FormatStrategy findFormatStrategy(FormatStrategyEnum formatStrategyEnum){
        return formatMap.get(formatStrategyEnum);
    }

}
