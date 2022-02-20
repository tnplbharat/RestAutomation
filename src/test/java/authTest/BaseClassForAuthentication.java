package authTest;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseClassForAuthentication {
	@BeforeClass
	 public void invokeAuthentication()
	 {
		
		RestAssured.authentication = RestAssured.preemptive().basic("ToolsQA", "TestPassword");
		RestAssured.baseURI = "http://restapi.demoqa.com/authentication/CheckForAuthentication/";
	 }

}
