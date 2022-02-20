package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestPostCall {

	@Test
	public void validatePostCall()
	{
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Bharat");
		jsonObj.put("job", "Tester");
		jsonObj.put("name", "Shruti");
		jsonObj.put("job", "Pharma");
		
		System.out.println(jsonObj.toJSONString());
		
		baseURI = "https://reqres.in/api";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(jsonObj.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).
		log().all();
		
	}
}
