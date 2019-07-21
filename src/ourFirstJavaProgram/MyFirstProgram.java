package ourFirstJavaProgram;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------Forms App----------");
		System.out.println("==============Welcome to User Registeration page============");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your first name ");
		String firstName = in.nextLine();
		
		System.out.println("What is Your last name");
		String lastName = in.nextLine();
		
		System.out.println("Please enter your height");
		double height = in.nextDouble();
		
		System.out.println("Enter your contact number");
		long phoneNumber = in.nextLong();
		
		
		System.out.println("You full Name is "+firstName + " " + lastName);
		System.out.println("Your height is : "+ height);
		System.out.println("Your contact number is " + phoneNumber);
		
		in.close();
	}
}
