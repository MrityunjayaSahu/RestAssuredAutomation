package com.reqresAPI.RestAssuredAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GetListOfUsers {
	
	/**
	 * @author Mrutyunjaya
	 * 
	 * 
	 */
	
	@Test
	public void verifyGetListUsers() {
		int expected_PageNumber = 2;
		try {
			JsonPath json = new JsonPath(PayLoad.getListUsersResponse(2));
			int actual_PageNumber = json.getInt("page");
			Assert.assertEquals(actual_PageNumber, expected_PageNumber, "Page Number doesn't Match");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
