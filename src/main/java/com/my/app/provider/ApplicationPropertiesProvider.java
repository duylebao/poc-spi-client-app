package com.my.app.provider;

import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import com.walmart.platform.exp.client.ae.context.IPropertiesProvider;

public class ApplicationPropertiesProvider implements IPropertiesProvider{
    private Properties props = new Properties();
    
    public ApplicationPropertiesProvider() {
        // mimic load from file
        props.setProperty("color", "black");
        props.setProperty("size", "0");
        props.setProperty("outline", "true");
        props.setProperty("border", "thin");
        props.setProperty("bg-color", "grey");
    }
    
    @Override
    public Map<String, String> getDefaultProperties() {
        return props.entrySet().stream().collect(
                Collectors.toMap(
                        k -> k.getKey().toString(),
                        v -> v.getValue().toString()
                   )
               );
    }

}
