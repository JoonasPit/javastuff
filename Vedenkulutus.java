import java.util.Scanner;
public class Vedenkulutus {

	public static void main(String[] args) {
	
		int StartPoint = 0;
		int months = 6;
		int[] Waterusage = new int[months];
		int UsedWater = 0;
		int amount = 0;
		int fullamount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna vesimittarin alkulukema: ");
		StartPoint = input.nextInt();
		
		for(int i = 0; i < months; i++) {
			System.out.print("Anna " +(i+1) +  ". vesimittarin " + "lukema: ");
			UsedWater = input.nextInt();

			Waterusage[amount] = UsedWater;
			fullamount = fullamount + UsedWater;
			amount++;
		}
		

			System.out.println("Kuukauden 1 kulutus oli " + (Waterusage[0]-StartPoint));
			System.out.println("Kuukauden 2 kulutus oli " + (Waterusage[1]-Waterusage[0]));
			System.out.println("Kuukauden 3 kulutus oli " + (Waterusage[2]-Waterusage[1]));
			System.out.println("Kuukauden 4 kulutus oli " + (Waterusage[3]-Waterusage[2]));
			System.out.println("Kuukauden 5 kulutus oli " + (Waterusage[4]-Waterusage[3]));
			System.out.println("Kuukauden 6 kulutus oli " + (Waterusage[5]-Waterusage[4]));
		  // Couldn't figure out how to print with a loop.


	}
}
