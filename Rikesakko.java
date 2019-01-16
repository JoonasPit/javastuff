import java.text.DecimalFormat;
import java.util.Scanner;

public class Rikesakko {

	public static void main(String[] args) {
	
		int SpeedLimit = 0;
		int UserSpeed = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna nopeusrajoitus: ");
		SpeedLimit = input.nextInt();
		
		System.out.print("Anna nopeutesi: ");
		UserSpeed = input.nextInt();
		
		if (SpeedLimit <= 60 && SpeedLimit >= 10 && UserSpeed-SpeedLimit <= 15) {
			System.out.print("Rikesakko on 170" );
		}
		
		else if (SpeedLimit <= 60 && SpeedLimit >= 10 && UserSpeed-SpeedLimit > 15 
				&& UserSpeed-SpeedLimit <= 20) {
			System.out.print("Rikesakko on 200" );
		}
		
		else if (SpeedLimit <=120 && SpeedLimit >= 70 && UserSpeed-SpeedLimit <= 15){
			System.out.print("Rikesakko on 140" );
		}
		
		else if (SpeedLimit <= 120 && SpeedLimit >= 70 && UserSpeed-SpeedLimit > 15 
				&& UserSpeed-SpeedLimit <= 20) {
			System.out.print("Rikesakko on 200" );
		}
		
		
		else if (UserSpeed-SpeedLimit > 20)
			System.out.print("Menee päiväsakoille");
	}

}
