/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * builds employees who belong to the operations team
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */
public class Operations extends Employees{
	
	/**
	 * Constructor for the operations employees object 
	 * @param empID employees id number
	 * @param name employees name
	 * @param sex employees gender
	 * @param birthday employees birthday
	 * @param joinDate employees hire date
	 */
	public Operations(int empID, String name, String sex, String birthday, String joinDate, double approvalAmount){
		super(empID, name, sex, birthday, joinDate, 0);
	}
}
