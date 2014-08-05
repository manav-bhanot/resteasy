/**
 * 
 */
package com.resteasy.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.resteasy.services.model.employee.Employee;
import com.resteasy.services.model.employee.EmployeeResponse;
import com.resteasy.services.model.employee.Name;

/**
 * @author Manav
 * 
 */
@Path("/sampleservice")
public class EmployeeService {

	private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();	

	static {

		Employee employee1 = new Employee();
		employee1.setEmployeeId(1);		
		Name emp1Name = new Name("Manav","Bhanot","Mr.");
		employee1.setName(emp1Name);
		employee1.setDesignation("Software Engineer");
		employees.put(employee1.getEmployeeId(), employee1);

		Employee employee2 = new Employee();
		employee2.setEmployeeId(2);		
		Name emp2Name = new Name("Neha","Bhanot","Mrs.");
		employee2.setName(emp2Name);
		employee2.setDesignation("Professor of Chemistry");
		employees.put(employee2.getEmployeeId(), employee2);

	}

	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello() {
		return "Hello World";
	}

	@GET
	@Path("/echo/{message}")
	@Produces("text/plain")
	public String echo(@PathParam("message") String message) {
		return message;
	}

	@GET
	@Path("/employees")
	@Produces("application/xml")
	public List<Employee> listEmployees() {
		return new ArrayList<Employee>(employees.values());
	}

	@GET
	@Path("/employee/{employeeid}")
	@Produces("application/xml")
	public Employee getEmployee(@PathParam("employeeid") String employeeId) {
		return employees.get(employeeId);
	}

	@GET
	@Path("/json/employees/")
	@Produces("application/json")
	public EmployeeResponse listEmployeesJSON() {
		List<Employee> empList = new ArrayList<Employee>(employees.values());		
		EmployeeResponse response = new EmployeeResponse(empList);		
		return response;
	}
	
	@GET
	@Path("/json/employees/list")
	@Produces("application/json")
	public Collection<Employee> listOfEmployeesJSON() {	
		return employees.values();
	}

	@GET
	@Path("/json/employee/{employeeid}")
	@Produces("application/json")
	public Employee getEmployeeJSON(@PathParam("employeeid") String employeeId) {
		return employees.get(employeeId);
	}

}
