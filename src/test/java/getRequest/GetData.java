package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

public class GetData {
	
	@Test
	public void testResponsecode() {
		
		int code = get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").getStatusCode();
		System.out.println("Status code is "+code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testResponse() {
		
		String data = get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").asString();
		System.out.println("Data is "+data);
		
		long time = get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad").getTime();
		System.out.println("Response time is "+time);
	}
}
