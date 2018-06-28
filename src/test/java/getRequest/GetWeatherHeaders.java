package getRequest;

import org.junit.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetWeatherHeaders {
@Test
public void GetWeather()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/Hyderabad");

	// Reader header of a give name. In this line we will get
	// Header named Content-Type
	String contentType = response.header("Content-Type");
	System.out.println("Content-Type value: " + contentType);
	Assert.assertEquals(contentType /* actual value */, "application/json" /* expected value */);
	
	// Reader header of a give name. In this line we will get
	// Header named Server
	String serverType =  response.header("Server");
	System.out.println("Server value: " + serverType);
	Assert.assertEquals(serverType /* actual value */, "nginx/1.12.2" /* expected value */);
	System.out.println("passed middle");

	// Reader header of a give name. In this line we will get
	// Header named Content-Encoding
	String contentEncoding = response.header("Content-Encoding");
	System.out.println("Content-Encoding: " + contentEncoding);
	Assert.assertEquals(contentEncoding /* actual value */, "gzip" /* expected value */);
	System.out.println("passed last");
}
}