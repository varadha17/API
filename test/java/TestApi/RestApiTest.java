package TestApi;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Base.TestBase;
import TestClass.RestClient;

public class RestApiTest extends TestBase {

	public RestClient rest;
	
	public RestApiTest() throws IOException {
		super();
		
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		getURL();
		 
		
	}
	
	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
		
		rest = new RestClient();
		
		rest.getClient(url);
		
	}
	

}
