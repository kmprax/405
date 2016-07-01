/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * Builds a company object that holds the company name, address, id and employee data
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */

import java.util.*;

public class Company{
	
	private String companyName;//Name of company field
	private String companyAddress;//address of company field
	private String companyID;//id of company field
	private Collection<Employees> employeeList = new ArrayList<Employees>();//collection of employees that work at the company
		
	/**
	 * Constructor for the company object 
	 * @param companyName
	 * @param companyAddress
	 * @param companyID
	 */
	public Company(String companyName, String companyAddress, String companyID){
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyID = companyID;
	}

	/**
	 * gets name of company
	 * @return name of company
	 */
	public String getCompanyName(){
		return companyName;
	}

	/**
	 * sets name of company
	 * @param companyName
	 */
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	/**
	 * gets address of company
	 * @return address of company
	 */
	public String getCompanyAddress(){
		return companyAddress;
	}

	/**
	 * sets address of company
	 * @param companyAddress
	 */
	public void setCompanyAddress(String companyAddress){
		this.companyAddress = companyAddress;
	}

	/**
	 * gets id of company
	 * @return id of company
	 */
	public String getCompanyID(){
		return companyID;
	}

	/**
	 * sets id of company
	 * @param companyID
	 */
	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}
	
	/**
	 * gets the employee list of company
	 * @return the list of employees for company
	 */
	public Collection<Employees> getEmployeeList(){
		return employeeList;
	}
	
	public void addEmployee(Employees employee)
	{
		employeeList.add(employee);
	}

	@Override
	public String toString(){
		return "Company [ companyName = " + companyName + ", companyAddress = " + companyAddress + ", companyID = " + companyID + "\n Employee Directory " + employeeList;
	}
}
