package com.my.app.provider;

import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import com.my.app.util.ConfigurationLoader;
import com.walmart.platform.exp.client.ae.context.IPropertiesProvider;

public class ApplicationPropertiesProvider implements IPropertiesProvider{
    private Properties props = null;
    
    public ApplicationPropertiesProvider() {
        props = ConfigurationLoader.load();
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
