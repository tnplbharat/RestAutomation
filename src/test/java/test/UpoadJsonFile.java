package test;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpoadJsonFile {
	@Test
	public void uploadJsonFileForPostCall()
	{
		String filePath = System.getProperty(("user.dir"));
		String path = File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"db.json";
		System.out.println(filePath+path);
		
		File file = new File(filePath+path);
		
		baseURI = "http://localhost:3000";
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(file).
		when().
		post("/users").
		then().
		assertThat().
		statusCode(201).
		log().all();
		
		
	}
}
