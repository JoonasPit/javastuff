import java.text.DecimalFormat;
import java.util.Scanner;

public class Luottolaskuri {

	public static void main(String[] args) {

		double PurchasePrice = 0;
		int MonthInstall = 0;
		double PaidPer = 0;

		Scanner input = new Scanner (System.in);
		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.print("Anna luotollisen ostoksen hinta: ");
		PurchasePrice = input.nextDouble();
		System.out.print("Anna kuukausierien lukumäärä: ");
		MonthInstall = input.nextInt();
		
		PaidPer = PurchasePrice/MonthInstall;
	
		for (int i = 1; PurchasePrice != 0; i++) {
			PurchasePrice = PurchasePrice - PaidPer;
			System.out.println(i +". erä" + desimaalit.format(PaidPer) + " euroa, luottoa jäljellä " + desimaalit.format(PurchasePrice)+ " euroa");
			
		}
	}

}
