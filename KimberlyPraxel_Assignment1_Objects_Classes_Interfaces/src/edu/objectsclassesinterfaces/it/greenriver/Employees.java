/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * Builds a employees object that holds the empId, name, sex, birthday, and joinDate
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */

public class Employees{
	
	private int empID; //employees id number
	private String name; //employees name
	private String sex; //employees gender
	private String birthday; //employees birthday
	private String joinDate; //employees hire date
	private double approvalAmount; //amount employee has to approve

	/**
	 * Constructor for the employees object 
	 * @param empID employees id number
	 * @param name employees name
	 * @param sex employees gender
	 * @param birthday employees birthday
	 * @param joinDate employees hire date
	 * @param approvalAmount amount employee has to approve
	 */
	public Employees(int empID, String name, String sex, String birthday, String joinDate, double approvalAmount){
		this.empID = empID;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.joinDate = joinDate;
		this.approvalAmount = approvalAmount;
	}
	
	/**
	 * gets employees id number
	 * @return employees id number
	 */
	public int getEmpID(){
		return empID;
	}
	
	/**
	 * sets employees id number
	 * @param empID
	 */
	public void setEmpID(int empID){
		empID = empID;
	}
	
	/**
	 * gets employees name
	 * @return employees name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * sets employees name
	 * @param name
	 */
	public void setName(String name){
		name = name;
	}
	
	/**
	 * gets employees gender
	 * @return employees gender
	 */
	public String getSex(){
		return sex;
	}
	
	/**
	 * sets employees gender
	 * @param sex
	 */
	public void setSex(String sex){
		sex = sex;
	}
	
	/**
	 * gets employees birthday
	 * @return employees birthday
	 */
	public String getBirthday(){
		return birthday;
	}
	
	/**
	 * sets employees birthday
	 * @param birthday
	 */
	public void setBirthday(String birthday){
		birthday = birthday;
	}
	
	/**
	 * gets employees hire date
	 * @return employees hire date
	 */
	public String getJoinDate(){
		return joinDate;
	}
	
	/**
	 * sets employees hire date
	 * @param joinDate
	 */
	public void setJoinDate(String joinDate){
		joinDate = joinDate;
	}
	
	/**
	 * sets approval amount
	 * @param approvalAmount
	 */
	public void setApprovalAmount(double approvalAmount){
		approvalAmount = approvalAmount;
	}
	
	/**
	 * gets approval amount
	 * @return approval amount
	 */
	public double getApprovalAmount(){
		return approvalAmount;
	}

	@Override
	public String toString(){
		return "\n Employee [ ID = " + empID + ", Name = " + name + ", sex = " + sex + ", birthday = " + birthday
				+ ", joinDate = " + joinDate + ", approvalAmount = " + approvalAmount + "]";
	}

}
