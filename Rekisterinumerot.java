import java.util.Scanner;

public class Rekisterinumerot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		String[] licenses = new String[MAX];
		String licensePlate = "";
		int amount = 0;
		Scanner input = new Scanner(System.in);

		while(!licensePlate.equals("-")){
		String CapLetters = licensePlate.substring(0).toUpperCase();

		licenses[amount] = CapLetters;
		if(amount < MAX) {
			
			System.out.print("Anna rekisterinumero (-lopettaa): ");
			licensePlate = input.nextLine().trim();
			amount++;
			}
		else {
			System.out.print("Ei enää rekisterinumeroita");
		}
		}
		System.out.print("Rekisterinumerot ovat: ");
			for(int i = 0; i < amount; i++) {
				System.out.println(licenses[i] + " ");
			}

	}

}
