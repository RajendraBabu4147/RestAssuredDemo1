package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ResponseBodyValidation {
  @Test
  public void BodyPrint() {
	  
	  RestAssured.baseURI = "https://gorest.co.in/public/v2";
	  RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
	  Response res = httpRequest.get("/users");
	  ResponseBody rbody = res.getBody();
	  System.out.println(rbody);
	  
	  System.out.println(rbody.asString());
  }
}
