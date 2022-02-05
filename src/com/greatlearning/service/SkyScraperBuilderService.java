package com.greatlearning.service;
import java.util.Stack;

public class SkyScraperBuilderService {
	
	public void daywisefloordisplay(int arrayfloorsize[],int nooffloors)
	{
		//Stack Variable
		Stack<Integer> stack = new Stack<>();
			
		//Floor counter variable
		int floor_counter =0;
		
		//Looping through the floor array entered by the user
		for(int i=0;i<arrayfloorsize.length;i++) {
			
			//Declaring required variables
			int currentfloor = arrayfloorsize[i];
			floor_counter = floor_counter+1;
			
			//Pushing the floor in stack if current floor is less than totalnumber of floors
			if(currentfloor<nooffloors) {
				
				stack.push(currentfloor);
				System.out.println("Day:"+floor_counter);
				System.out.println("");
				continue;
			}
			
			//Displaying the floors to be assembled on a given day
			else {
				int floorcheck;
				
				System.out.println("Day:"+floor_counter);
				System.out.println(currentfloor);
				
				nooffloors = nooffloors -1;
				
				//Popping the floors from stack that needs to be assembled on the required day
				for(int j=0;j<floor_counter-1;j++) {
					
					//Breaking from the loop if all floors are assembled
					if(nooffloors==0) {
						break;
					}
					
					//Popping floors from the stack
					else {
					
					floorcheck = stack.pop();
					
					if(floorcheck<nooffloors) {
						stack.push(floorcheck);
						break;
					}
					
					//Displaying the floors to be assembled to the user
					else {
						System.out.println(floorcheck);
						nooffloors = nooffloors -1;
					}
					
					
				}
			}
				
		}
	}

}
}
