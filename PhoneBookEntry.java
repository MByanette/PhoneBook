import java.util.ArrayList;
import java.util.Random;

public class PhoneBookEntry {
	//variables
	private String name;
	private String number;
	//This is an array of objects, each object/name is
//	an individual element is seperated by a comma and in 
//	quotes because we want to use them individually.
//	We will use these later when generating the full names
	private static final String[] First = {"Sofia", "Isabella", "Daniela", "Daniel", "Elena", "Maria", "Francisco", "Andrea", "Miguel", "Carlos", "Arturo", "Luna", "Luis", "Katya", "Yanet"};
	private static final String [] Last = {"Martinez", "Aguilarm", "Castillo", "Alvarez", "Luz", "Ortega", "Carrillo", "Escobar", "Acosta", "Bravo", "Barrera", "Ayala", "Prada", "Colima", "Perez"};
	public static void main(String[] args) {
		
	
	ArrayList<PhoneBookEntry> phoneBookEntry = new ArrayList<>();
	//ArrayList<String> names = new ArrayList<>();
	//ArrayList<Integer> numbers = new ArrayList<>();
	for (int i = 0; i < 10; i++) {
		PhoneBookEntry entry = PhoneBookEntry.generateRandomEntry();
		phoneBookEntry.add(entry);
		//for(.int k = 0;..k < 10; k++..){
	//	numbers.add(generateNumbers);
	//}
	}
	//Displays or prints the arraylist
	for(PhoneBookEntry entry : phoneBookEntry) {
		System.out.println("Name: " + entry.getName() + "\nPhone Number: " + entry.getNumber());
	}
	
	}
	
	
	public PhoneBookEntry(String name, String number){
		this.name = name;
		this.number = number;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public static PhoneBookEntry generateRandomEntry() {
		Random rand = new Random();
//		We are taking one object from the first names array
//		and one object from the last names array.
//		Then we are randomly picking them using a random 
//		Integer.
//		
		String firstName = First[rand.nextInt(First.length)];
		String lastName = Last[rand.nextInt(Last.length)];
		//Stores randomly generated number in here.
		String phoneNumber = generateRandomNumber();
//		Gets the random first and last names from the 
//		variables above and then adds them together into
//		the string called fullName.
		String fullName = firstName + " " + lastName;
		//We are returning the object called PhoneBookEntry
//		composed of 2 strings, the fullName and phoneNumber.
		return new PhoneBookEntry(fullName, phoneNumber);
	}
	public static String generateRandomNumber() {
//		Generates random phone number of 10 digits 
//		and then concatenates it into a string
		StringBuilder phoneNumber = new StringBuilder();
//		Picks 2 numbers between 1 and 9 to start the phone
//		number off and then fills in the rest of the 
//		digits with random numbers between 0 and 10.
		Random rand = new Random();
		phoneNumber.append(rand.nextInt(9)+1);
		
		for(int i = 0; i<9; i++) {
			phoneNumber.append(rand.nextInt(10));
		}
		//Returns the number in a string
		return phoneNumber.toString();
		
	}
	
	
	
}

