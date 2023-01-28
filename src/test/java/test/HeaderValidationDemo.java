package test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderValidationDemo {
  @Test
  public void HeaderPrint() {
	  
	  RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
	  RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
	  Response res = httpRequest.get("");
	  /*
	   Headers headers = res.getHeaders();
	   for(Header header:headers){
	   		  {
			  System.out.println("key: " +header.getName()+" value: "+header.getValue());
		  }
	  }
	  */

	  String contentType = res.header("Content-Type");

	  String conn = res.header("Connection");
	  
	  System.out.println(contentType);

	  System.out.println(conn);
	  
	  
	  
	  
  }
}
