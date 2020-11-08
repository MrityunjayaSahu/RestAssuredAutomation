package com.reqresAPI.RestAssuredAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class DeleteUser {
	
	@Test
	public void verifyDeleteUser() {
		try {
			JsonPath json = new JsonPath(PayLoad.deleteUserDetails());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
