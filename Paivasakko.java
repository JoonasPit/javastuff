package swd02.vko.kotitehtavat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PaivaSakko {

	public static void main(String[] args) {
		int tulot = 0;
		int sakko = 0; //paivasakko in €
	
		// create a scanner type olio, that can read
		// user input
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Anna nettotulot: ");
		tulot = input.nextInt(); //Lukee seuraavan kokonaisluvun
		
		//create calculation for
		
		sakko = (tulot-255)/60;
		System.out.print("Nettotuloilla " + tulot + " päiväsakko on " + sakko + "euroa");
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Nettotuloilla " + tulot + " päiväsakko on " + desimaalit.format(sakko) + "euroa");


	}

}
