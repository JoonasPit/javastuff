import java.util.Scanner;
import java.text.DecimalFormat;

public class Kilometrikorvaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int KlmDriven = 0;
		int TotalKlm = 0;
		double KlmRec = 0.43;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
		KlmDriven = input.nextInt();
		
		for (int i = 0; KlmDriven != 0; i++){
			TotalKlm = TotalKlm + KlmDriven;
			System.out.print("Anna ajetut kilometrit (0 lopettaa): ");
			KlmDriven = input.nextInt();
			
		}
		DecimalFormat desimaalit = new DecimalFormat("0.00");

		System.out.println("Yhteensä " + TotalKlm + "kilometriä" );
		System.out.print("Korvaus on " + desimaalit.format(KlmRec*TotalKlm)+ " euroa");

	}

}
