package test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
public class RunGetAndPutCallForInternalServer extends BaseTest{
	
	@Test
	public void validateInternalServerPostCall()
	{
		JSONObject jObj = new JSONObject();
		jObj.put("firstname", "Bharat P");
		jObj.put("lastname", "Joshi");
		jObj.put("id", "1");
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(jObj.toJSONString()).
		when().
		put("/users/1").
		then().
		statusCode(200);
		
		
		
	}

}
