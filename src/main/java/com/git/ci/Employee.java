/**
 * 
 */
package com.git.ci;

import java.io.Serializable;

/**
 * @author Arunangsu Sahu student today
 * @version 1.0
 *
 */
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4645561467970099412L;
	private String employeeId;
	private String employeeName;

	/**
	 * 
	 */
	public Employee() {
		// No-argument Constructor
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @param employeeId
	 * @param employeeName
	 */
	public Employee(String employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	

}
