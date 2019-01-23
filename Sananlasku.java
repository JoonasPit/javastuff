import java.util.Scanner;

public class Sananlasku {

	public static void main(String[] args) {
		// Lukee sananlaskuja kunnes input = loppu
		
		String Proverb;
		int TotalChars = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna sananlasku: ");
		Proverb = input.nextLine();
		TotalChars = Proverb.length();
		
		for (int i = 1;!Proverb.equals("LOPPU");i++) {
			System.out.print("Anna sananlasku: ");
			Proverb = input.nextLine();
			
			TotalChars = TotalChars + Proverb.length();
			
			if (Proverb.equals("LOPPU")){
				System.out.print("Sananlaskuja oli " + i +" kappaletta.");
				System.out.print("Sananlaskuissa oli merkkejä yhteensä " + (TotalChars - 5));
			}
		}
		

	}

}
