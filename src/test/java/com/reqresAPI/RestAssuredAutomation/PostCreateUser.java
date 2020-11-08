package com.reqresAPI.RestAssuredAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class PostCreateUser {
	
	@Test
	public void verifyPostCreateUser() {
		try {
			JsonPath json = new JsonPath(PayLoad.postCreateUser("Smith", "Technical Lead"));
			String actual_createdAt = json.getString("createdAt");
			System.out.println("Created Date is : " + actual_createdAt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
