package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class IpCheck {
	
	@Test
	public void checkIp() {
		String ipResponce = RestAssured.given().when().get("https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1").thenReturn().asString();
		System.out.println(ipResponce);
		Assert.assertNotNull(ipResponce);
	}
	

}
