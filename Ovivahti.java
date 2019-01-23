import java.util.Scanner;

public class Ovivahti {

	public static void main(String[] args) {
		
		String CorrectPass = "ruska";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ovivahti kysyy 1.kertaa, tunnussana? ");
		CorrectPass = input.nextLine();
		
		if (!CorrectPass.equals("ruska")) {
			for (int i = 2;!CorrectPass.equals("ruska"); i++) {
				System.out.print("Ovivahti kysyy " + i + ". kertaa, tunnussana? ");
				CorrectPass = input.nextLine();
				if (CorrectPass.equals("ruska")){
					System.out.print("SISÄÄN");
				}
				
				else if(i == 3) {
					System.out.print("OVI ON LUKITTU");
					break;
				}
		}
			
			}
		else {
			System.out.print("SISÄÄN");
		}
	}

}
