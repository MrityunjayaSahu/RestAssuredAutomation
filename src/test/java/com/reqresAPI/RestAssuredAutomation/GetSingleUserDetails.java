package com.reqresAPI.RestAssuredAutomation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetSingleUserDetails {
	
	/**
	 * @author Mrutyunjaya
	 * 
	 * 
	 */
	
	@Test
	public void verifyGetSingleUser() {
		String expected_Email = "michael.lawson@reqres.in";
		try {
			JsonPath json = new JsonPath(PayLoad.getSingleUserResponse(7));
			String actual_Email = json.getString("data.email");
			Assert.assertEquals(actual_Email, expected_Email, "Email ID doesn't Match");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
}
