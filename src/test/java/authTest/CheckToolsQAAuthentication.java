package authTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CheckToolsQAAuthentication extends BaseClassForAuthentication{
	@Test
	
	public void checkAuthentication()
	{
		int code = RestAssured.given()
				.when()
				.get()
				.getStatusCode();
		System.out.println("status code is "+code);
	}

}
