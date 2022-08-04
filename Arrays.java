/**
 * Input the heights of four people;
 * compute their average;
 * find out how many people are above the average height
 * 
 * @author (Pedro)
 * @version (12/05) 
 */

import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
		
		int numOfHeights = 5;
		double [] heights = new double [numOfHeights];
		double totalHeights = 0;
		
		// use a scanner to ask user to input the heights for each person 
			Scanner kb = new Scanner(System.in);
		
			for (int i=0; i<numOfHeights; i++) {
				System.out.println("Please, input the height for person "+(i+1)+":");
				heights[i] = kb.nextDouble();
			
		//add the existing heights with the ones being input
			totalHeights += heights[i];
			
			}
		
		//output the people and their respective heights.
			for (int i=0; i<numOfHeights; i++) {
					System.out.println("The height of person "+(i+1)+" is "+heights[i]);
				}
		
		//output the sum of the heights 
			System.out.println("The sum of the heights is "+totalHeights);
		
		//calculate and output the average of the heights.
			double average = totalHeights/numOfHeights;
			System.out.println("The average is "+average);
		
		//count the no. of people whose height is above the average
			int aboveAverageCounter=0;
			for (int i=0; i<numOfHeights; i++) {
				if (heights[i]>average)
				System.out.println("The person "+heights[i]+ " is above the average");	
					aboveAverageCounter++;	
			}
			
			System.out.println("The no. of people whose height is above the average is: "+aboveAverageCounter);
		
		
		}

}
