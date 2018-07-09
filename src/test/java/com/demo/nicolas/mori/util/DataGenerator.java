package com.demo.nicolas.mori.util;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import com.demo.nicolas.mori.modelclass.Address;
import com.demo.nicolas.mori.modelclass.NewUsers;
import com.jayway.restassured.RestAssured;

public class DataGenerator {

	public static List<NewUsers> generateAName() {

		String jsonToString = RestAssured.get("https://jsonplaceholder.typicode.com/users").asString();

		JSONArray array1 = new JSONArray(jsonToString);

		List<NewUsers> list1 = new ArrayList<NewUsers>();

		for (int i = 0; i < 10; i++) {
			NewUsers newUsers = new NewUsers();
			Address newAddress = new Address();

			newUsers.setName(array1.getJSONObject(i).getString("name"));
			newUsers.setUsername(array1.getJSONObject(i).getString("username"));
			newUsers.setEmail(array1.getJSONObject(i).getString("email"));
			newAddress.setStreet(array1.getJSONObject(i).getJSONObject("address").getString("street"));
			newAddress.setSuite(array1.getJSONObject(i).getJSONObject("address").getString("suite"));
			newAddress.setCity(array1.getJSONObject(i).getJSONObject("address").getString("city"));
			newAddress.setZipcode(array1.getJSONObject(i).getJSONObject("address").getString("zipcode"));
			newUsers.setAddress(newAddress);
			list1.add(newUsers);
		}

		return list1;
	}
}
