/**
 * 
 */
package com.resteasy.services.initializer;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.resteasy.services.EmployeeService;

/**
 * @author Manav
 * 
 */
public class RESTApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public RESTApplication() {
		singletons.add(new EmployeeService());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
