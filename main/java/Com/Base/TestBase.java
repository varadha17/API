package Com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

	public static Properties prop;
	
	public static String service;
	
	public static String respon;
	
	public static String url;
	
	public TestBase() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\name\\eclipse-workspace\\API\\src\\main\\java\\Config\\Properties\\api.properties");
		
		prop.load(fis);
		
		
	}
	
	
	public static void getURL() {
		
		service = prop.getProperty("ServiceURL");
		
		respon = prop.getProperty("RequestURL");
		
		 url = service + respon;
		
		
		
		
	}
	
	
	
	
}
