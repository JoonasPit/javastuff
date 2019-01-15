package kotitehtäviä;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Palkka {


	public static void main(String[] args) {
		// Ohjelma joka kysyy bruttopalkan
		//veroprosentin iän laskee nettopalkan
	int BrutSalary = 0;
	double TaxPerc = 0;
	int UserAge = 0;
	double TaxAmount = 0;
	double UnEmploy = 0.0115;
	double PayedEmploy = 0;
	double RetiredFund = 0;
	double SalaryLeft = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("Anna palkka: ");
	BrutSalary = input.nextInt();
	
	System.out.print("Anna veroprosentti: ");
	TaxPerc = input.nextDouble();
	
	System.out.print("Anna ikä: ");
	UserAge = input.nextInt();

	TaxAmount = BrutSalary*TaxPerc/100;
	
	PayedEmploy = BrutSalary*UnEmploy;
	if (UserAge >= 53) {
		RetiredFund = BrutSalary*0.0705;
	}
	else {
		RetiredFund = BrutSalary*0.0555;
	}
	SalaryLeft = BrutSalary-TaxAmount-PayedEmploy-RetiredFund;
	
	DecimalFormat desimaalit = new DecimalFormat("0.00");

	
	System.out.println("Bruttopalkka " + BrutSalary);
	System.out.println("Veron osuus " + desimaalit.format(TaxAmount));
	System.out.println("Työeläkevakuutusmaksun osuus " + desimaalit.format(RetiredFund));
	System.out.println("Työttömyysvakuutuksen osuus " + desimaalit.format(PayedEmploy));	
	System.out.print("Käteen jää " + desimaalit.format(SalaryLeft));
	}

}
