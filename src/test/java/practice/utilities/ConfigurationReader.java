package practice.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    static {

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String keyMame){
        return properties.getProperty(keyMame);
    }

}
