package com.reqresAPI.RestAssuredAutomation;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class PutUpdateUserDetails {
	
	@Test
	public void verifyPutUserDetails() {
		try {
			JsonPath json = new JsonPath(PayLoad.putUpdateUser("John", "DevOps"));
			String actual_updatedAt = json.getString("updatedAt");
			System.out.println("Updated Date is : " + actual_updatedAt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
