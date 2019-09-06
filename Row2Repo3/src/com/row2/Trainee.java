/***
 * Author: Htin Linn Aung
 * Date  : September 06, 2019
 * Trainee.java
 */

package com.row2;

public class Trainee {

	private int id;
	private String firstName;
	private String lastName;
	private String fromCity;
	private String preferredRelocationCity;
	public Trainee(int id, String firstName, String lastName, String fromCity, String preferredRelocationCity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fromCity = fromCity;
		this.preferredRelocationCity = preferredRelocationCity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getPreferredRelocationCity() {
		return preferredRelocationCity;
	}
	public void setPreferredRelocationCity(String preferredRelocationCity) {
		this.preferredRelocationCity = preferredRelocationCity;
	}
	
	
}
