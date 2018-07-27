package org.java.maven.unitconverter;

import java.util.Scanner;

/**
 * @author rajendra
 */
/**
 * UnitConverter gets the user input and convert to specified units
 */
public class UnitConverter {
	public static void main(String args[]) {
		System.out.println("Select an option from below list\n"
				+ "1.convert meters to inches\n2.convert meters to feet\n"
				+ "3.convert inches to meters\n4.convert inches to feet\n"
				+ "5.convert feet to meters\n6.convert feet to inches");
		Scanner inputUnit = new Scanner(System.in);
		int input = inputUnit.nextInt();
		switch(input) {
		case 1:	System.out.println("Enter the meters you want to convert");
				double metersToInches = inputUnit.nextDouble();
				ConvertToInches.metersToInches(metersToInches);
		case 2: System.out.println("Enter the meters you want to convert");
				double metersToFeets = inputUnit.nextDouble();
				ConvertToFeets.metersToFeets(metersToFeets); 
		case 3: System.out.println("Enter the inches you want to convert");
				double inchesToMeters = inputUnit.nextDouble();
				ConvertToMeters.inchesToMeters(inchesToMeters);
		case 4:	System.out.println("Enter the inches you want to convert");
				double inchesToFeets = inputUnit.nextDouble();
				ConvertToFeets.inchesToFeet(inchesToFeets);
		case 5:	System.out.println("Enter the feets you want to convert");
				double feetsToMeters = inputUnit.nextDouble();
				ConvertToMeters.feetToMeters(feetsToMeters);
		case 6: System.out.println("Enter the feets you want to convert");
				double feetsToInches = inputUnit.nextDouble();
				ConvertToInches.feetToInches(feetsToInches);
		}
		inputUnit.close();
	}
}
