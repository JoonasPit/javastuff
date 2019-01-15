import java.text.DecimalFormat;
import java.util.Scanner;

public class Kimppakyyti {
	
	public static void main(String[] args) {



			DecimalFormat desimaalit = new DecimalFormat("0.00");

			int KlmDriven = 0;
			double LtrperKm = 0;
			double GasPrice = 0;
			int PersAmount = 0;
			double CostperPerson = 0;
			
			Scanner input  = new Scanner(System.in);
			System.out.print("Anna ajetut kilometrit: ");
			KlmDriven = input.nextInt(); //Lukee seuraavan kokonaisluvun
			
			System.out.print("Anna kulutus per 100 km: ");
			LtrperKm = input.nextDouble();
			
			System.out.print("Anna polttoaineen litrahinta: ");
			GasPrice = input.nextDouble();
			
			System.out.print("Anna kimppakyytiläisten lukumäärä: ");
			PersAmount = input.nextInt();
			
			CostperPerson = KlmDriven*LtrperKm/100*GasPrice/PersAmount;
			
			System.out.print("Bensakustannus per henkilö on " + desimaalit.format(CostperPerson) + "euroa");
			
			
			
		}
}
