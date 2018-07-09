/**
 * 
 */
package com.demo.nicolas.mori.modelclass;

/**
 * @author nicolasmori
 *
 */
public class Address {
	
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	
	
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * street String
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * suite String
	 * @return the suite
	 */
	public String getSuite() {
		return suite;
	}
	/**
	 * @param suite the suite to set
	 */
	public void setSuite(String suite) {
		this.suite = suite;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * city String
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * zipcode String
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @param street
	 * @param suite
	 * @param city
	 * @param zipcode
	 */
	public Address(String street, String suite, String city, String zipcode) {
		super();
		this.street = street;
		this.suite = suite;
		this.city = city;
		this.zipcode = zipcode;
	}
	/**
	 * 
	 */
	public Address() {
		super();
	}
}
