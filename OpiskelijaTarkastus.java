import java.util.Scanner;

public class OpiskelijaTarkastus {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Anna opiskelijatunnus: ");
		String StudentNumber;
		StudentNumber = input.nextLine();
		if(StudentNumber.substring(0,1).matches("a") && 
				StudentNumber.substring(1,8).matches("\\d{7}")) {
			System.out.println("Opiskelijatunnus on kelvollinen");
		}
			else {
				System.out.println("Opiskelijatunnus on kelvoton");
			}
		System.out.print("Anna Opiskelijan nimi: ");
		String StudentName;
		StudentName = input.nextLine();
		if (StudentName.matches("[A-ZÅÄÖ a-zåäö-]{2,20}")){
			System.out.println("Opiskelijan nimi on kelvollinen");
		}
		else {
			System.out.println("Opiskelijan nimi on kelvoton");
		}
		
		System.out.print("Anna opiskelijan ryhmä: ");
		String StudentGroup;
		StudentGroup = input.nextLine();
		if (StudentGroup.matches("[A-Z]{2}\\d{1}[A-Z]{2}")) {
			System.out.println("Opiskelijan ryhmä on kelvollinen");
		}
		else {
			System.out.println("Opiskelijan ryhmä on kelvoton");
		}
		System.out.print("Anna opiskelijan ikä: ");
		String StudentAge;
		StudentAge = input.nextLine();
		
		if (StudentAge.matches("\\d{1,2}")) {
			int AgeAsInt = Integer.parseInt(StudentAge);
			  if(AgeAsInt <= 65 && AgeAsInt >= 18) {
					System.out.print("Ikä on kelvollinen");
					
				}
				else {
					System.out.print("ikä pitää olla 18-65");
				}
		}
		else {
			System.out.print("Ikä pitää olla numeerinen");
		}

	}

}
