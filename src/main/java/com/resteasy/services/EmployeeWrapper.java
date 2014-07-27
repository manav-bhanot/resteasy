/**
 * 
 */
package com.resteasy.services;

import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

import com.resteasy.services.model.Employee;

/**
 * @author Manav
 * 
 */
public class EmployeeWrapper {
	private final ArrayList<Employee> employee;

	@JsonCreator
	public EmployeeWrapper(@JsonProperty("employee") ArrayList<Employee> employee) {
		this.employee = employee;
	}

	public ArrayList<Employee> getEmployee() {
		return employee;
	}
}
