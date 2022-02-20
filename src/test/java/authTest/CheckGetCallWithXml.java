package authTest;

//import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.RestAssured;
import io.restassured.http.ContentType;
//import io.restassured.path.json.JsonPath;
//import io.restassured.response.Response;
//import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CheckGetCallWithXml {

	@Test
	public void checkGetCallForXML()
	{
		baseURI = "https://parabank.parasoft.com/parabank/services/bank/customers/";
		given().
		contentType(ContentType.XML).
		accept(ContentType.XML).
		when().
		get("12212/").
		then().
		assertThat().
		body("customer.address.zipCode", equalTo("90210"),"customer.phoneNumber", equalTo("310-447-4121")).
		and().
		assertThat().
		body("customer.ssn", equalTo("622-11-9999")).and().assertThat().statusCode(200);
		
		
		//RequestSpecification reqstSp = RestAssured.given();
		//Response res = reqstSp.get("https://parabank.parasoft.com/parabank/services/bank/customers/12212/");
		//JsonPath jPath = res.getBody().jsonPath();
		//String zipCodeForCity = res.getBody().asString();
		//Assert.assertEquals(zipCodeForCity,"90210");
		//Assert.assertEquals(res.getStatusCode(),"200");
	}
}
