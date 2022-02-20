package test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class RunGetAndPostCallForInternalServer extends BaseTest{
	
	@Test
	public void validateInternalServerGetCall()
	{
		given().
		get("/users").
		then().
		statusCode(200).
		log().
		all().
		body("[1].firstname", equalTo("Shruti"));
		
		
	}
	

	@Test
	public void validateInternalServerPostCall()
	{
		JSONObject jObj = new JSONObject();
		jObj.put("firstname", "John");
		jObj.put("lastname", "Conaty");
		jObj.put("id", "4");
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(jObj.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201);
		
		
		
	}

}
