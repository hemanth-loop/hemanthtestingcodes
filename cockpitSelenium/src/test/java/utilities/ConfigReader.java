package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
     private static Properties prop;
    public static Properties initProperties() throws IOException {
        prop = new Properties();
       try {
           FileInputStream ip = new FileInputStream("src/test/java/utilities/data.properties");
           prop.load(ip);
       }catch (Exception E)
       {
           System.out.println(E.getMessage());
       }
       return prop;
    }
}
