/**
 * 
 */
package com.demo.nicolas.mori.modelclass;

import java.util.List;

/**
 * @author nicolasmori
 *
 */
public class NewUsers {

	private String name;
	private String username;
	private String email;
	private Address address;
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
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
	 * @user nicolasmori 2018-07-08
	 * username String
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * email String
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @description 
	 * @user nicolasmori 2018-07-08
	 * address Address
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @param name
	 * @param username
	 * @param email
	 * @param address
	 */
	public NewUsers(String name, String username, String email, Address address) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
	}
	/**
	 * 
	 */
	public NewUsers() {
		super();
	}



}
