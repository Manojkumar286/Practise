package com.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetRequest {

	@Test
	private void getMethod() {
		RestAssured.baseURI = "https://reqres.in/";

		Response response = RestAssured.given().when().get("/api/users/2").then().log().all().statusCode(200).extract()
				.response();
		int statusCode = response.getStatusCode();
		String valueOf = String.valueOf(statusCode);
		Assert.assertEquals("200", valueOf);
		System.out.println(response.asString());

	}
}
