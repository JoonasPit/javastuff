import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		
		double PizzaPrice1 = 0;
		double PizzaPrice2 = 0;
		double PizzaPrice3 = 0;
		double FinalPrice = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Anna pizzojen hinnat (3):  ");
		PizzaPrice1 = input.nextDouble();
		PizzaPrice2 = input.nextDouble();
		PizzaPrice3 = input.nextDouble();
		
		FinalPrice = PizzaPrice1+PizzaPrice2+PizzaPrice3;
		
		if (PizzaPrice1 < PizzaPrice2 && PizzaPrice1 < PizzaPrice3) {
			FinalPrice = PizzaPrice1+PizzaPrice2+PizzaPrice3-PizzaPrice1;
		}
		
		else if (PizzaPrice2 < PizzaPrice1 && PizzaPrice2 < PizzaPrice3) {
			FinalPrice = PizzaPrice1+PizzaPrice2+PizzaPrice3-PizzaPrice2;
		}
		
		else if (PizzaPrice3 < PizzaPrice1 && PizzaPrice3 < PizzaPrice2) {
			FinalPrice = PizzaPrice1+PizzaPrice2+PizzaPrice3-PizzaPrice3;
		}

		DecimalFormat desimaalit = new DecimalFormat("0.00");
		
		System.out.println("Maksettavaa: " + desimaalit.format(FinalPrice));
		System.out.print("Yksittäisen hinta: " + desimaalit.format(FinalPrice/3));
		
	}

}
