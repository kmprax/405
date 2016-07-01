/*
 * Kimberly M. Praxel
 * IT405 Mobile Development Frameworks
 * Assignment 1: Objects, Classes, Interfaces
 * July 1, 2016 11:59pm
 */

package edu.objectsclassesinterfaces.it.greenriver;

/**
 * driver class for homework1
 * 
 * @author Kimberly M. Praxel
 * @version 1.0
 */

public class CompanyDriver{

	public static void main(String [] args){
		
		//create some companies
		Company company1 = new Company("Big A", "123 FairyTale Lane, MakeBelieveLand, USA 12345", "123");
		Company company2 = new Company("Big B", "456 FairyTale Lane, MakeBelieveLand, USA 12345", "456");
		
		
		//create some admins
		Administrator admin1 = new Administrator(001, "Jane Doe", "F", "01-01-1901", "01-01-2001", 10000.00);
		Administrator admin2 = new Administrator(001, "John Doe", "M", "01-01-1901", "01-01-2001", 10000.00);
		
		//add admins to companies
		company1.addEmployee(admin1);
		company2.addEmployee(admin2);
		
		//create some financial analyst
		Financial_Analyst finad1 = new Financial_Analyst(002, "Grace Kelly", "F", "06-17-1911", "05-21-1961", 10000.00);
		Financial_Analyst finad2 = new Financial_Analyst(002, "Katherine Hepburn", "F", "03-15-1912", "01-12-1951", 10000.00);
		
		//add financial analyst to companies
		company1.addEmployee(finad1);
		company2.addEmployee(finad2);

		//add operations employees
		Operations op1 = new Operations(003, "Fred Astire", "M", "11-14-1921", "12-01-1951", 00.00);
		Operations op2 = new Operations(003, "Gary Grant", "M", "09-15-1917", "05-31-1949", 00.00);
		Operations op3 = new Operations(004, "Aubrey Hepburn", "F", "09-15-1907", "06-30-1953", 00.00);
		Operations op4 = new Operations(004, "James Stewart", "M", "05-31-1923", "07-22-1952", 00.00);
		Operations op5 = new Operations(005, "John Wayne", "M", "06-30-1934", "08-18-1962", 00.00);
		Operations op6 = new Operations(005, "Kathereen O'Hara", "F", "12-01-1936", "09-15-1963", 00.00);
		
		//add operations to companies
		company1.addEmployee(op1);
		company1.addEmployee(op2);
		company1.addEmployee(op3);
		company2.addEmployee(op4);
		company2.addEmployee(op5);
		company2.addEmployee(op6);
		
		//show companies information
		System.out.println(company1);
		System.out.println("\n" + company2);
		

	}


}
