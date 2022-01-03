package pack2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("TestNg Test - 1");
	  
	  RestAssured.baseURI="https://demoqa.com/utilities/weather/city";
	
	  //Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
	  RequestSpecification httpRequest = RestAssured.given();
	  
	  Response response = httpRequest.request(Method.GET, "/Hyderabad");
	  
	// Now let us print the body of the message to see what response
			// we have recieved from the server
			String responseBody = response.getBody().asString();
			
			System.out.println("Response Body is =>  " + responseBody);
			
			

  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
