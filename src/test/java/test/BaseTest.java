package test;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;

public class BaseTest {
	@BeforeClass
	public void invokeURI()
	{
		baseURI = "http://localhost:3000";
		
	}

}
