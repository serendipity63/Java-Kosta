package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties prop1 = new Properties();
		Properties prop2 = new Properties();
		try {
			prop1.load(new FileInputStream("setting.txt"));
			System.out.println("setting 읽음");
			prop2.load(new FileInputStream("test1.txt"));
			System.out.println("test1 읽음");
			// System.out.println(prop1.getProperty("title"));
//			System.out.println(prop1.getProperty("content"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}