package authTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OAuth {
	@Test
	public void oAuthExample()
	{
		
		Response res =RestAssured.given()
				.auth()
				.oauth("consumerkey", "consumersecret", "accesstoken", "secrettoken")
				.when()
				.post("https://api.twitter.com/update.json?status=my data");
		System.out.println("response code"+res.getStatusCode());
		System.out.println("response code"+res.getBody().asString());
		
		JsonPath jPath = res.jsonPath();
		String id =jPath.get("id_Str");
		
	}

}
