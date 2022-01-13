package assignment1HCL;
import java.util.*;

public class arrayListAssignment {
	public static void main(String[] args) {
		String id;
		String name;
		String city;
		ArrayList<String> employee = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter employee ID: ");
		id = scan.nextLine();
		employee.add(id);
		System.out.println("Please enter employee's name: ");
		name = scan.nextLine();
		employee.add(name);
		System.out.println("Please enter employee's city: ");
		city = scan.nextLine();
		employee.add(city);
		
		System.out.println("Employee Information: ");
		System.out.println();
		for(int i = 0; i < employee.size(); i++) {
			System.out.println(employee.get(i));
		}
	}

}

/*
 * 
 *  2. Arraylists should be used when collecting database records.
 *  
 *  3. A map is used as an association of a key and a value. With a list you have basically only values.
       The indexes in List are always int, whereas in Map you can have another Object as a key.
       
    4. Insertion order is not retained in a set. Should use if you don't want duplicates
    
 * 
 * */
