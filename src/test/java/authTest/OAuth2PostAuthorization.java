package authTest;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2PostAuthorization {

	//@Test
	public void validateChickenPostCall() {

		Response res = RestAssured.given().auth().oauth2("04d21eb8bf86a25ba74f8ef05d3e87479c5763ed").when()
				.post("http://coop.apps.symfonycasts.com/api/2830/chickens-feed");

		System.out.println("Response code " + res.getStatusCode());
		System.out.println("response body " + res.jsonPath().prettify());
		Assert.assertEquals(res.jsonPath().get("message"), "Your chickens are now full and happy");

	}

	@Test
	public void getAuthToken() {
		Response resp = RestAssured.given().formParam("client_id", "RestAuomation")
				.formParam("client_secret", "061ce341e53749ee44511e6c4ee4e79e")
				.formParam("grant_type", "client_credentials").post("http://coop.apps.symfonycasts.com/token");

		String token = resp.jsonPath().get("access_token");
		System.out.println("token " + token);

		Response res = RestAssured.given().auth().oauth2(token).when()
				.post("http://coop.apps.symfonycasts.com/api/2830/chickens-feed");

		System.out.println("Response code " + res.getStatusCode());
		System.out.println("response body " + res.jsonPath().prettify());
		Assert.assertEquals(res.jsonPath().get("message"), "Your chickens are now full and happy");
		
		
		List al =new ArrayList(2);
		al.add(1);
		al.add(1);
		al.add(1);
		System.out.println(al.size());
		
		int i=0;
		System.out.println(i++);

	}

}
