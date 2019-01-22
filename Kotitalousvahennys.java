import java.util.Scanner;
import java.text.DecimalFormat;


public class Kotitalousvahennys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double WoComp = 0;
		double TotalComp = 0;
		int omavastuu = 100;
		double Compensation = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		WoComp = input.nextDouble();
		
		while (WoComp != 0){
		TotalComp = TotalComp + WoComp;
		System.out.print("Anna työkorvauksen määrä (0 lopettaa): ");
		WoComp = input.nextDouble();
		}
		
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		Compensation = ((TotalComp*45)/100) - omavastuu;
		if (Compensation > 2400) {
			System.out.print("Kotitalousvähennyksen määrä on " + "2400,00 euroa");
		}
		else if (Compensation < 0){
			System. out.print("Kotitalousvähennyksen määrä on 0,00 euroa");
		}
		else {
		System.out.print("Kotitalousvähennyksen määrä on " + desimaalit.format(Compensation) + "euroa");
		}
	}
}
