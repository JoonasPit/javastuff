import java.util.Scanner;

public class Arvaus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int RightGuess = 78;
		int UserGuess = 0;
		
		Scanner input = new Scanner (System.in);
		System.out.print("Arvaa lukua väliltä 1-100: ");
		UserGuess = input.nextInt();
		if (UserGuess == RightGuess){
			System.out.print("Arvasit oikein. Arvauksia oli 1");
			}
		
		for (int i = 2; UserGuess != RightGuess; i++) {
		
			if (UserGuess == RightGuess){
				System.out.print("Arvasit oikein. Arvauksia oli" + " " + i);
				}
			else if (UserGuess < RightGuess){
				System.out.print("Arvaa suurempaa: ");
				UserGuess = input.nextInt();
				if (UserGuess == RightGuess){
					System.out.print("Arvasit oikein. Arvauksia oli" + " " + i);
					}
			}
			else if(UserGuess > RightGuess){
				System.out.print("Arvaa pienempää: ");
				UserGuess = input.nextInt();
				if (UserGuess == RightGuess){
					System.out.print("Arvasit oikein. Arvauksia oli" + " " + i);
					}
			}
			
		}
	}
		
		
	}
