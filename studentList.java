// Importing the ArrayList library
import java.util.ArrayList;

// We will store 10 objects into an ArrayList then display these objects
public class studentList {
	
	// Creating the instanced variables
	int rollNo;
	String name;
	String address;
	
	// Constructor class for the ArrayList
	public studentList(int rollNo, String name, String address) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		
	}
	
	public static void main(String[] args) {
		

		// Creating the objects to store into the ArrayList
		studentList obj1 = new studentList(101, "James Henry", "1042 Northcut Way");
		studentList obj2 = new studentList(102, "Frank Peterson", "942 James Cv");
		studentList obj3 = new studentList(103, "Kyle Smith", "1502 Diana Dr");
		studentList obj4 = new studentList(104, "Paco Suarez", "221 Risinger Pl");
		studentList obj5 = new studentList(105, "Hillary Butler", "712 Rainbow Rd");
		studentList obj6 = new studentList(106, "Susan Sanchez", "1245 Killaminjaro");
		studentList obj7 = new studentList(107, "Peter Griffin", "999 Chowder St");
		studentList obj8 = new studentList(108, "Nancy Hourglass", "758 Clanky Ave");
		studentList obj9 = new studentList(109, "Luis Gonzales", "1236 Burnet Rd");
		studentList obj10 = new studentList(110, "Bob Jacket", "494 St. Peters Blvd");
		
		// Creating the ArrayList
		ArrayList<studentList> list = new ArrayList<studentList>();
		
		// Add the objects to the ArrayList
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		list.add(obj8);
		list.add(obj9);
		list.add(obj10);
		
		// Creating an additional line for cohesion
		System.out.println("---------------------------------");
		
		// Creating the for loop to display all the information
		for (studentList ob : list) {
			
			System.out.println("Student Number: " + ob.rollNo);
			System.out.println("Student Name: " + ob.name);
			System.out.println("Student Address: " + ob.address);
			System.out.println("---------------------------------");
		}
		
	}
}

