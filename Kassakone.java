import java.util.Scanner;
import java.text.DecimalFormat;


public class Kassakone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SinglePrice = 0;
		double TotalPrice = 0;
		double TaxAmount = 0;
		double NoTax = 0;

		Scanner input = new Scanner (System.in);
		System.out.print("Anna ostoksen hinta (0 lopettaa): ");
		SinglePrice = input.nextDouble();

	while (SinglePrice != 0) {
		TotalPrice = TotalPrice + SinglePrice;

		System.out.print("Anna ostoksen hinta (0 lopettaa): ");
		SinglePrice = input.nextDouble();
	}
	TaxAmount = TotalPrice*24/124;
	NoTax = TotalPrice - TaxAmount;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");
	
	System.out.print("Ostosten verollinen hinta on " + desimaalit.format(TotalPrice));
	System.out.print("ALV:n osuus on" + desimaalit.format(TaxAmount));
	System.out.print("Veroton hinta on" + desimaalit.format(NoTax));
	}
		

}
