package TestClass;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;

public class RestClient {
	
	//GET Method
	public void getClient(String url) throws ClientProtocolException, IOException {
		
		CloseableHttpClient ctc = HttpClients.createDefault();
		
		HttpGet get = new HttpGet(url);
		
		CloseableHttpResponse chr= ctc.execute(get);
		
		//Status code
		
		int status = chr.getStatusLine().getStatusCode();
		
		System.out.println("Status Code:"+status);
		
		Assert.assertEquals(status, 200);
		
		//JSON String
		
		String entity = EntityUtils.toString(chr.getEntity(),"UTF-8");
	
		JSONObject jsonresponse = new JSONObject(entity);
		
		System.out.println("Json Response:"+jsonresponse);
		
		//Headers
		
		Header[] header = chr.getAllHeaders();
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		
		for(Header head: header) {
			
			hmap.put(head.getName(), head.getValue());
			
			
		}
	
		System.out.println("All headers:"+hmap);
	
	
	
	
	
	}
	
	
	
	

}
