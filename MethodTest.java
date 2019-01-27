package kotitehtäviä;
import java.util.Scanner;
import java.text.DecimalFormat;

public class MethodTest {
	public static double askSaleprice() {

		double SalePrice = 0;
	
		Scanner input = new Scanner(System.in);
	
	
		System.out.print("What is the Price You wish to sell at: ");
		SalePrice = input.nextDouble();
		return SalePrice;

		}
	public static double countreward(double SalePrice) {
		double REWARD = 3.44;
		double MINREWARD = 2214.00;
		double reward = SalePrice * (REWARD / 100);
		if (reward < MINREWARD) {
			reward = MINREWARD;
		}
		return reward;
		
	}

	public static void main(String[] args) {
		
		double SalePrice;
		double reward;
		
		SalePrice = askSaleprice();
		reward = countreward(SalePrice);
		DecimalFormat f = new DecimalFormat("0.00");
		System.out.print("Full cost = " + (reward + SalePrice));
	}

}
