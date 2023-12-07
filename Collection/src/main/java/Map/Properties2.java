package Map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Properties2 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println(sysProp.getProperty("java.version"));
        System.out.println(sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
