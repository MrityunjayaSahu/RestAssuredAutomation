package com.reqresAPI.RestAssuredAutomation;

import io.restassured.path.json.JsonPath;

public class PatchUpdateUserDetails {

	public void verifyPatchUserDetails() {
		String name = "Archer";
		String job = "Developer";
		
		try {
			JsonPath json = new JsonPath(PayLoad.patchUpdateUser(name, job));
			String actual_updatedAt = json.getString("updatedAt");
			System.out.println("Updated Date is : " + actual_updatedAt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
