package first;

import java.util.Scanner

public class InputController
{
	//Declaration section for instance variables.
	//Data members are always private.
	private Scanner inputScanner; 

	public InputController()
	{
		inputScanner = new Scanner(System.in);
	}	
	
	public void questions()
	{
		System.out.println("Please type in your name");
		String myInput;	
		myInput = inputScanner.next();
		inputScanner.nextLine();
		System.out.println("Hello there" +myInput + ", do you like pizza?");
		System.out.println("Did you type more than one name? I am sorry, please type your full name");
		String fullName = inputScanner.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("My name is Java");
	}