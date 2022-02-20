package test;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class PojoSerilizationObject extends BaseTestForPojo {
	@Test
	public void verificationOfSerilizedJsonObj() throws JsonProcessingException {
		
		Users us1 = new Users("Diti", 5, "Joshi");
		Users us2 = new Users("Prachi", 6, "JoshiGogate");
		List<Users> addUsers = new ArrayList<>();
		addUsers.add(us1);
		addUsers.add(us2);
		
		Subjects sub1 = new Subjects("Python", 3);
		Subjects sub2 = new Subjects("C#", 4);
		List<Subjects> addSubj = new ArrayList<>();
		addSubj.add(sub1);
		addSubj.add(sub2);
		
		Payload payload = new Payload(addUsers,addSubj);

		ObjectMapper objMap = new ObjectMapper();
		String data = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
		//System.out.println(data);
		
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(data).
		when().
		post("/users").
		then().
		statusCode(201).
		log().
		all();
		
		
	}

}
