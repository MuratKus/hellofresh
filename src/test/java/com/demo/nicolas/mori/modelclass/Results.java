/**
 * 
 */
package com.demo.nicolas.mori.modelclass;

/**
 * @author nicolasmori
 *
 */
public class Results {
	
	public String name;
	public String alpha2_code;
	public String alpha3_code;
	
	
	
	/**
	 * 
	 */
	public Results() {
		super();
	}
	/**
	 * @param name
	 * @param alpha2_code
	 * @param alpha3_code
	 */
	public Results(String name, String alpha2_code, String alpha3_code) {
		super();
		this.name = name;
		this.alpha2_code = alpha2_code;
		this.alpha3_code = alpha3_code;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-05
	 * name String
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-05
	 * alpha2_code String
	 * @return the alpha2_code
	 */
	public String getAlpha2_code() {
		return alpha2_code;
	}
	/**
	 * @param alpha2_code the alpha2_code to set
	 */
	public void setAlpha2_code(String alpha2_code) {
		this.alpha2_code = alpha2_code;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-05
	 * alpha3_code String
	 * @return the alpha3_code
	 */
	public String getAlpha3_code() {
		return alpha3_code;
	}
	/**
	 * @param alpha3_code the alpha3_code to set
	 */
	public void setAlpha3_code(String alpha3_code) {
		this.alpha3_code = alpha3_code;
	}
	
	
	
	
}
