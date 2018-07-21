package com.usa.restfulapi;

import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class ApiTestingClass {
	@Test
	public void weatherreport () {
		
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("New York");
		System.out.println("Status code: " + response.getStatusCode());
		System.out.println("Response Body is: " + response.asString());
		
		
	}
}
