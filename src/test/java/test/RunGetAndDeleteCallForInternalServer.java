package test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class RunGetAndDeleteCallForInternalServer extends BaseTest{
	
	@Test
	public void validateInternalServerPostCall()
	{	
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		when().
		delete("/users/4").
		then().
		statusCode(200);
		
		
		
	}

}
