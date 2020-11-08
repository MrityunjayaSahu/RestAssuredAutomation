package com.reqresAPI.RestAssuredAutomation;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class PayLoad {
	
	public static String BASE_URI = "https://reqres.in";
	
	public static String getSingleUserResource(int id) {
		return "/api/users/"+ id + "";
	}
	
	public static String getSingleUserResponse(int id) {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
				          log().all().
                   when().
                          get(getSingleUserResource(id)).
                   then().
                          log().all().assertThat().statusCode(200).extract().response().asString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String getListUsersResource(int pageNumber) {
		return "/api/users?page=" + pageNumber + "";
	}
	
	public static String getListUsersResponse(int pageNumber) {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
			               log().all().
	               when().
	                      get(getListUsersResource(pageNumber)).
	               then().
	                      log().all().assertThat().statusCode(200).extract().response().asString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String payload(String name, String job) {
		return "{\r\n" + 
				"    \"name\": \""+name+"\",\r\n" + 
				"    \"job\": \""+job+"\"\r\n" + 
				"}";
	}
	
	public static String postCreateUser(String name, String job) {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
					       body(payload(name, job)).
				   when().
				           post("/api/users").
				   then().
				           log().all().assertThat().statusCode(201).extract().response().asString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String putUpdateUser(String name, String job) {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
					       body(payload(name, job)).
				   when().
				           put("/api/users/2").
				   then().
				           log().all().assertThat().statusCode(200).extract().response().asString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String patchUpdateUser(String name, String job) {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
					       body(payload(name, job)).
				   when().
				           patch("/api/users/2").
				   then().
				           log().all().assertThat().statusCode(200).extract().response().asString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static String deleteUserDetails() {
		try {
			RestAssured.baseURI = BASE_URI;
			return given().
					       log().all().
				   when().
				           delete("/api/users/2").
				   then().
				           assertThat().statusCode(204).extract().asString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
