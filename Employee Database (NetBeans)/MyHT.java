/**********

	NAME:                              Umer Amjad
	STUDENT NUMBER:                    483475

	ICS4U0-A, Feb-June 2016

	THIS FILE IS PART OF THE PROGRAM: Open Hash Table

 **********/


import java.util.*;


public class MyHT
{

	// buckets is an array of ArrayLists.  Each item in each ArrayList is an EmployeeInfo object.
	private ArrayList<EmployeeInfo>[] buckets;



	// CONSTRUCTOR, instantiates entered number of buckets and array list for each bucket. 
	public MyHT(int howManyBuckets) 
	{
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) 
		{
			buckets[i] = new ArrayList<EmployeeInfo>();  // Instantiate the ArrayList for bucket i.
		}
	}


	//Method to calculate bucket number
	//Parameters: key value (e.g. employee number) 
	//Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.

	public int calcBucket(int keyValue) 
	{
		return(keyValue % buckets.length); //uses mod to the number of buckets to decide which bucket
	}

	
	//Method to add employee to table
	//parameters: EmployeeInfo object to add
	//Returns true if employee is successfully added, false if employee is not added (e.g. a problem occurs)

	public boolean addToTable(EmployeeInfo theEmployee) 
	{
		if (buckets[calcBucket(theEmployee.getEmpNum())].add(theEmployee) == true) //if add() method returns true (i.e. it works)
			return true; //employee is added to list, so this method returns true
		return false; 
	}


	//Method to search for an employee in the table
	//parameters: employee number (keyvalue) to search for
	//returns index (position, counting from 0) of employee in the arraylist if found, otherwise returns -1

	public int searchTable(int employeeNum) 
	{
		for (int i=0 ; i < buckets[calcBucket(employeeNum)].size() ; i++) //goes through list in appropriate bucket
			if (buckets[calcBucket(employeeNum)].get(i).getEmpNum() == employeeNum) //checks if item in list has same employee number as the one to search for
				return i;
		return -1;
	}


	//Method to remove employee from list
	//parameters: employee number (keyvalue) to remove employee
	//Searches for employee in list, removes if found and returns, otherwise returns null

	public EmployeeInfo removeFromTable(int employeeNum) 
	{
		if (searchTable(employeeNum) != -1) //checks if employee to remove is found
			return buckets[calcBucket(employeeNum)].remove(searchTable(employeeNum)); //removes if found, returns to program
		return null; 
	}


	//Method to display all employees in list
	//no parameters, returns void 
	//Print the employee numbers for the employees stored in each bucket's ArrayList, starting with bucket 0, then bucket 1, and so on.

	public void displayTable() 
	{
		for (int n=0 ; n < buckets.length ; n++)     //for every bucket, 0 to how many buckets there are 
		{
			System.out.println("Bucket " + n); 
			if (buckets[n].size() != 0)
			{
				for (int i=0 ; i < buckets[n].size() ; i++) // for every item in the list, 0 to how many items there are
					System.out.println(buckets[n].get(i).getEmpNum() + ", " + buckets[n].get(i).getFirstName() + ", " + buckets[n].get(i).getLastName() + ", " + buckets[n].get(i).getDeductionsRate());
			}
			else
				System.out.println("empty");
			System.out.println("");
		}
	}


} // end class MyHashTable
