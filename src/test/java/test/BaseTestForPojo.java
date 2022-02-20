package test;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;
public class BaseTestForPojo {
	
	@BeforeClass
	public void invokePOJOSerilization()
	{
		baseURI = "http://localhost:3000";
	}

}
