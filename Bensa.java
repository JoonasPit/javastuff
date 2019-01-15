package swd02.vko.kotitehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bensa {
	public static void main(String[] args) {
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		double GasInput = 0; // Tankattu bensa
		int AmountDriven = 0; //ajettu määrä
		double PerLitre = 0; // syöttetty litrahinta
		double TankkausHinta = 0;
		
		// create a scanner type olio, that can read
		// user input
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Anna tankattu määrä: ");
		GasInput = input.nextDouble(); //Lukee seuraavan kokonaisluvun
		
		System.out.print("Anna ajetut kilometrit: ");
		AmountDriven = input.nextInt(); //Lukee ajetun matkan
		
		System.out.print("Anna litrahinta: ");
		PerLitre = input.nextDouble();	
		
		TankkausHinta = (GasInput/AmountDriven)*PerLitre;
		
		
		System.out.print("Ajo per kilometri maksaa " + desimaalit.format(TankkausHinta));
		


	}
}
