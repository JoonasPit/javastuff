package swd02.vko.kotitehtavat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Alennus {
	public static void main(String[] args) {

		DecimalFormat desimaalit = new DecimalFormat("0.00");

		
		double NoDiscount = 0;
		int discount = 0;
		double CountDiscount = 0;
		
		Scanner input  = new Scanner(System.in);
		System.out.print("Anna alentamaton hinta: ");
		NoDiscount = input.nextDouble(); //Lukee seuraavan kokonaisluvun
		
		System.out.print("Anna alennusprosentti: ");
		discount = input.nextInt();
		
		CountDiscount = NoDiscount*(100-discount)/100;
		System.out.print("Alennettu hinta on " + desimaalit.format(CountDiscount));
		
		
		
	}
}
