package swd02.vko.kotitehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matka {
	public static void main(String[] args) {

	
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		int DriveAmount = 0;
		int AvgSpeed = 0;
		double DriveTime = 0;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Anna matka: ");
		
		DriveAmount = input.nextInt(); // reads Amount Driven
		
		System.out.print("Anna nopeus: ");
		AvgSpeed = input.nextInt();
		
		DriveTime = (double)DriveAmount/AvgSpeed;
		
		System.out.print("Aikaa menee: " + desimaalit.format(DriveTime) + " tuntia");
	}
}
