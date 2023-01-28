package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredAPITest {
  @Test
  public void getUsers() {
	  RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
	  RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
	  Response res = httpRequest.request(Method.GET,"");
	  int statCode = res.getStatusCode(); 
	  assertEquals(200,statCode);
	  
	  System.out.println(res.getStatusLine()); 
	  System.out.println(res.prettyPrint());
	  
  }
}
