package kotitehtäviä;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Matkavertailu {

	public static void main(String[] args) {
	
		int TripAmount = 0;
		double SingleTicket = 0;
		double MonthTicket = 0;
		double PriceSingle = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Montako matkaa teet kuukaudessa: ");
		TripAmount = input.nextInt();
		
		System.out.print("Anna yksittäisen lipun hinta: ");
		SingleTicket = input.nextDouble();
		
		System.out.print("Anna kuukausilipun hinta: ");
		MonthTicket = input.nextDouble();
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");


		PriceSingle = SingleTicket*TripAmount;
		
		if (PriceSingle > MonthTicket) {
		System.out.print("Kuukausilippu on " + desimaalit.format(PriceSingle-MonthTicket) + " euroa halvempi kuin yksittäinen");
		}
		
		else if (PriceSingle < MonthTicket) {
		System.out.print("Yksittäinen on " + desimaalit.format(MonthTicket-PriceSingle) + " euroa halvempi kuin kuukausilippu");
		}
	}

	
}
