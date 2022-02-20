package test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class TestPutCall {

	@Test
	public void validatePostCall()
	{
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "Shruti");
		jsonObj.put("job", "Pharma");
		
		System.out.println(jsonObj.toJSONString());
		
		baseURI = "https://reqres.in";
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(jsonObj.toJSONString()).
		when().
		put("/api/users/2").
		then().
		statusCode(200).
		log().all();
		
	}
}
