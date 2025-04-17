package bu.clinix.service;

import java.time.*;
import java.util.*;

import com.sun.org.apache.xpath.internal.operations.And;


// Java program for the above approach
public class DiffernceDate
{

	  
	    // Function to print difference in
	    // time start_date and end_date
	    static void
	    findDifference(LocalDate start_date,
	                   LocalDate end_date)
	    {
	    	System.out.println(start_date+"\n----------------------------\n"+end_date);
	  
	        // find the period between
	        // the start and end date
	        Period diff
	            = Period
	                  .between(start_date,
	                           end_date);
	  
	        // Print the date difference
	        // in years, months, and days
	        System.out.print(
	            "Difference "
	            + "between two dates is: ");
	  
	        // Print the result
	        if(diff.getYears()<0 || diff.getMonths()<0 || diff.getDays()<0)
	        {
	        	System.out.println("Attention, personne inexistante !!!");
	        }
	        else if(diff.getYears()==0)
	        {
	        	System.out.printf(
	    	            " %d months"
	    	                + " and %d days ",
	    	            diff.getMonths(),
	    	            diff.getDays());
	        }
	        else if(diff.getYears()==0 && diff.getMonths()==0)
	        {
	        	System.out.printf(
	    	                " and %d days ",
	    	            diff.getDays());
	        }
	        else
	        {
	        	System.out.printf(
	    	            "%d years, %d months"
	    	                + " and %d days ",
	    	            diff.getYears(),
	    	            diff.getMonths(),
	    	            diff.getDays());
	        }
	    }
	  
	    // Driver Code
	    public static void main(String[] args)
	    {
	        // Start date
	        LocalDate start_date
	            = LocalDate.of(2021 , 07, 10);
	  
	        // End date
	        LocalDate end_date
	            = LocalDate.of(2020, 06, 10);
	  
	        // Function Call
	        findDifference(start_date,
	                       end_date);
	    }
}
