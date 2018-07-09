package com.demo.nicolas.mori.backend;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.demo.nicolas.mori.modelclass.Info;
import com.demo.nicolas.mori.modelclass.Results;
import com.jayway.restassured.RestAssured;

public class GetMethods {

	/**
	 * This method retrive all the information of the countries in a list of objects
	 * results.
	 * 
	 * @return List<Results> with a list of results.
	 */
	public List<Results> getAllTheCountriesnAndReturnInAListOfObjects() {
		String jsonToString = RestAssured.get("http://services.groupkt.com/country/get/all").asString();

		JSONObject obj = new JSONObject(jsonToString);
		List<Results> list2 = new ArrayList<Results>();

		JSONArray array = obj.getJSONObject("RestResponse").getJSONArray("result");

		for (int i = 0; i < array.length(); i++) {
			Results results = new Results();
			results.setName(array.getJSONObject(i).getString("name"));
			results.setAlpha2_code(array.getJSONObject(i).getString("alpha2_code"));
			results.setAlpha3_code(array.getJSONObject(i).getString("alpha3_code"));
			list2.add(results);
		}
		return list2;
	}

	/**
	 * This method retrieve all the information of a single country code in a object
	 * result.
	 * 
	 * @param alpha2_code
	 *            string with the value of the code inside.
	 * @return object results.
	 */
	public Results getTheJsonAndReturn1Result(String alpha2_code) {
		String jsonToString = RestAssured.get("http://services.groupkt.com/country/get/iso2code/" + alpha2_code)
				.asString();
		JSONObject obj = new JSONObject(jsonToString);
		JSONObject obj2 = obj.getJSONObject("RestResponse").getJSONObject("result");
		Results results = new Results();
		results.setName(obj2.getString("name"));
		results.setAlpha2_code(obj2.getString("alpha2_code"));
		results.setAlpha3_code(obj2.getString("alpha3_code"));
		return results;
	}

	/**
	 * This method retrieve a String with the error message after send a bad single
	 * code of country.
	 * 
	 * @param alpha2_code
	 *            String with a bad single code.
	 * @return a String with the response message.
	 */
	public String getTheJsonAndReturn1Message(String alpha2_code) {
		String jsonToString = RestAssured.get("http://services.groupkt.com/country/get/iso2code/" + alpha2_code)
				.asString();
		Info info = new Info();
		JSONObject obj = new JSONObject(jsonToString);
		JSONArray obj3 = obj.getJSONObject("RestResponse").getJSONArray("messages");
		info.setMessages(obj3.getString(0));
		return info.getMessages();
	}
}
