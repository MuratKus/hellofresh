package com.demo.nicolas.mori.steps;

import java.util.ArrayList;
import java.util.List;

import com.demo.nicolas.mori.framework.ParentScenario;
import com.demo.nicolas.mori.modelclass.Results;
import com.jayway.restassured.response.ValidatableResponse;

/**
 * @author nicolasmori
 *
 *         This abstract class help to share information like objects, variables
 *         of differents things we need to share between differents steps, is
 *         very used in cases when we need to make end to end testing, in
 *         example to share a result of the backend to the UI, or mobile.
 *
 */
public abstract class StepsHelper extends ParentScenario {

	protected String userFirstName = "someFirstname";
	protected String userLastName = "someLastname";
	protected String userEmail = null;
	protected String userPassword = "password";
	protected List<Results> listOfResults = new ArrayList<Results>();
	protected String nameToValidate = null;
	protected String alpha2ToValidate = null;
	protected String alpha3ToValidate = null;
	protected Results singleCountryInfo;
	protected String messageResponse;
	protected ValidatableResponse postStatusResponse;

}
