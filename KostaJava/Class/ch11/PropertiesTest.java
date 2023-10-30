package ch11;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("name", "Son Heung Min");
		prop.setProperty("age", "30");
		prop.setProperty("height", "182.5");
		prop.setProperty("weight", "77.5");

		try { // try catch로 묶여있어야함

			prop.store(new FileOutputStream("profile.properties"), "profile");
			prop.storeToXML(new FileOutputStream("profile.xml"), "profile");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
