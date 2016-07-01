/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * builds employees who belong to the administrator team
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */

public class Administrator extends Employees implements CheckSigning{

	/**
	 * Constructor for the administrator employees object 
	 * 
	 * @param empID employees id number
	 * @param name employees name
	 * @param sex employees gender
	 * @param birthday employees birthday
	 * @param joinDate employees hire date
	 */
	public Administrator(int empID, String name, String sex, String birthday, String joinDate, double approvalAmount){
		super(empID, name, sex, birthday, joinDate, approvalAmount);
	}
	/**
	 * shows if check is approved
	 */
	@Override
	public void canSignChecks(double amount){
		
		System.out.println(this.getName() + " has approved this check for the amount of $" + amount + ".");
	}
	
}
