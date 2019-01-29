import java.util.Scanner;
import java.text.DecimalFormat;

public class Palkkalaskuri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");
		
		final int MAX = 100;
		double HourlySalary = 0;
		int DayAmount = 0;
		int[] hours = new int[MAX];
		int hour = 0;
		int amount = 0;
		int fullHours = 0;
		
		System.out.print("Anna tuntipalkkasi: ");
		HourlySalary = input.nextDouble();
		System.out.print("Monenko päivän tuntimäärät annat: ");
		DayAmount = input.nextInt();
		for (int i = 0; i < DayAmount; i++) {
			System.out.print("Anna tuntien määrä päivässä: ");
			hour = input.nextInt();
			hours[amount] = hour;
			fullHours = fullHours + hour;
			amount++;
		}
		
		System.out.println("Tunteja yhteensä: " + fullHours);
		System.out.println("Bruttopalkkasi: " + f.format(fullHours*HourlySalary));
		System.out.print("Annoit tunnit: ");
		for (int b = 0; b < DayAmount; b++ ) {
			System.out.print(hours[b] + " ");
			  }
	}

}
