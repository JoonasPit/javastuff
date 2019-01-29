import java.util.Scanner;
import java.util.Arrays;

public class Lampotilat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 100;
		int temperature = 0;
		int[] temperatures = new int[MAX];
		int amount = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Anna lämpötila: ");
		temperature = input.nextInt();
		
		while(temperature != -999) {
			if(amount < MAX) {
			temperatures[amount] = temperature;

			System.out.print("Anna lämpötila: ");
			temperature = input.nextInt();
			amount++;
			}
		}
		System.out.print("Annoit lämpötilat: ");
		Arrays.sort(temperatures, 0, amount);
		for (int i = 0; i < amount; i++){
			System.out.print(temperatures[i] + " ");
		}
		
	}

}
