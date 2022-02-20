package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestDeleteCall {

	@Test
	public void validateDeleteCall()
	{

		baseURI = "https://reqres.in";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		when().
		delete("/api/users/2").
		then().
		statusCode(204).
		log().all();
		
	}
}
