package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            // Dynamic path to the properties file
            String path = System.getProperty("user.dir") + "/src/test/resources/data.properties";
            FileInputStream fis = new FileInputStream(path);
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load data.properties file");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
