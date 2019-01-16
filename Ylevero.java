import java.text.DecimalFormat;
import java.util.Scanner;

public class Ylevero {

	public static void main(String[] args) {
		int UserAge = 0;
		double UserIncome = 0;
		double YleTax = 0.68;
		double TaxAmount = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Anna vuositulosi ja ikäsi: ");
		UserIncome = input.nextDouble();
		UserAge = input.nextInt();
		
		TaxAmount = UserIncome*YleTax/100;
		
		if (UserAge < 18) {
		TaxAmount = 0;
		}
		
		else if (TaxAmount > 140) {
		TaxAmount = 140;
		}
		
		else if (TaxAmount < 70) {
		TaxAmount = 0;
		}
		DecimalFormat desimaalit = new DecimalFormat("0.00");

	
		System.out.print("Ylevero on " + desimaalit.format(TaxAmount));
	
	}
}
