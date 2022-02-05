//Creating and importing packages
package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.service.*;

public class SkyScraperBuilderDriver {

	public static void main(String[] args) {
		//Declaring the scanner class
		Scanner sc = new Scanner(System.in);
		
		//Creating object of the Service class
		SkyScraperBuilderService scb = new SkyScraperBuilderService();
				
		//Taking the required inputs from user
		System.out.println("Enter the total no of floors in the building");
						
		int nooffloors = sc.nextInt();
		int array_floorsize[] = new int[nooffloors];
			
		//Display Variable
		int display_variable = 1;
		//Taking the required floor size from user
		for(int i=0;i<nooffloors;i++) 
		{
			
			System.out.println("Enter the floor size given on day : " +display_variable);
			array_floorsize[i] = sc.nextInt();
			display_variable++;
					
		}
		
		//Calling the service function
		scb.daywisefloordisplay(array_floorsize,nooffloors);
				

	}

}
