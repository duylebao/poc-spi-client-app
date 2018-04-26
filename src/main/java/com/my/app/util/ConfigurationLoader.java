package com.my.app.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationLoader {
    public static Properties load() {
        return load("application.properties");
    }
    
    public static Properties load(String resourceName) {
        Properties props = new Properties();
        InputStream input = null;
        try {
            input = ConfigurationLoader.class.getClassLoader().getResourceAsStream(resourceName);
            props.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return props;
    }
}
