package com.demo.nicolas.mori.backend;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.ValidatableResponse;

public class PostMethods {

	private String bodyToSend;
	private String endpoint;
	private ValidatableResponse statusResponseCode;
	private String oauthKey = "Basic c21hcnRmcm9nOnBsZWFzZWFza21lMjAxOA";

	/**
	 * This is an example class to make a post in a service Rest currently is not
	 * activated.
	 * 
	 * @param newCodeContry
	 *            this is an String with the new country code.
	 * @return ValidatableResponse this is the response code of the post.
	 */
	public ValidatableResponse postANewCountry(String newCodeContry) {
		bodyToSend = "{ name: \"Test Country\",alpha2_code: \"TC\",alpha3_code: \"TCY\"}";
		endpoint = "http://services.groupkt.com/country/post";

		statusResponseCode = RestAssured.given().header("Authorization", oauthKey)
				.contentType("application/json; charset=UTF-8").body(bodyToSend).when().post(endpoint).then()
				.statusCode(200);
		return statusResponseCode;
	}

}
