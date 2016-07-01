/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * builds employees who belong to the financial analyst team
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */

public class Financial_Analyst extends Employees implements ExpenseApproval{
	
	/**
	 * Constructor for the financial analyst employees object 
	 * 
	 * @param empID employees id number
	 * @param name employees name
	 * @param sex employees gender
	 * @param birthday employees birthday
	 * @param joinDate employees hire date
	 */
	public Financial_Analyst(int empID, String name, String sex, String birthday, String joinDate, double approvalAmount){
		super(empID, name, sex, birthday, joinDate, approvalAmount);
	}
	
	/**
	 * shows if expense report has been approved
	 */
	@Override
	public void approvedExpenses(double amount){
		System.out.println(this.getName() + " has approved this expense up to the amount of $" + amount + ".");	
	}
}
