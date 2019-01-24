import java.util.Scanner;

public class OsoiteTarra {

	public static void main(String[] args) {
  
		String FirstName; 
		String LastName;
		String UserAddress;
		int PostNumber = 0;
		String City;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Anna etu- ja sukunimi: ");
		FirstName = input.next().trim();
		LastName = input.next().trim();

		String FirstLetter = FirstName.substring(0,1).toUpperCase();
		String RestOf = FirstName.substring(1).toLowerCase();
		String BigFirst = FirstLetter + RestOf;
		String LastFirst = LastName.substring(0,1).toUpperCase();
		String RestOfLast = LastName.substring(1).toLowerCase();
		String BigLast = LastFirst + RestOfLast;
		input.nextLine();

		System.out.print("Anna katuosoite: ");
		UserAddress = input.nextLine().trim();
		
		String AddressFirst = UserAddress.substring(0,1).toUpperCase();
		String AddressRest = UserAddress.substring(1).toLowerCase();
		String FullAddress = AddressFirst + AddressRest;
		
		System.out.print("Anna postinumero ja postitoimipaikka: ");
		PostNumber = input.nextInt();
		City = input.nextLine().trim();
		String CityCaps = City.toUpperCase();

		
		System.out.println(BigFirst + " " + BigLast);
		System.out.println(FullAddress);
		System.out.print(PostNumber + " " + CityCaps);
	}

}
