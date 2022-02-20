package test;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.net.http.HttpResponse.BodyHandler;

import io.restassured.response.Response;

public class TestGetCall {
	
	//@Test
	public void testGetCall()
	{
		//Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		SoftAssert softAssert = new SoftAssert();
		Response response = get("https://reqres.in/api/users?page=2");
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		int statusCode = response.getStatusCode();
		String header = response.getHeader("content-type");
		softAssert.assertEquals(statusCode,200);
		softAssert.assertEquals(header,"application/json; charset=utf-8");
		softAssert.assertAll();
	}
	
	@Test
	public void bddStyleTestCallForGet()
	{
		baseURI = "https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[1].first_name",equalTo("Lindsay")).
		body("data.first_name", hasItems("Tobias", "Byron", "George", "Rachel"));
		
	}

}
