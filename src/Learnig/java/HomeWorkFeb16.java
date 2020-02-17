package Learnig.java;

import java.util.Random;
import java.util.Scanner;

public class  HomeWorkFeb16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Write a program that creates an array which
//		can hold ten values. Fill the array with random numbers
//		from 1 to 100. Display the values in the array on the screen.
//		Then use a linear search to find the largest value in the array,
//		and display that value and its slot number.
//		Array: 45 87 39 32 93 86 12 44 75 50
//
//		The largest value is 93
//		It is in slot 4
//
//		
//		int[] x = new int []{2,23,34,56,78,89,99,45,21,59};
//		
//		int largest = Integer.MIN_VALUE;
//			
//		for (int number : x) {
//			if(number>largest) {
//				largest=number;
//			} 
//		}
//		
//		System.out.println("The largest value is " +largest);
		
//		
//		Type in the following code, and get it to compile.
//		This assignment shows you how we can abuse a while loop 
//		to make something repeat an exact number of times.
////		---------------------------------------------------------------------
//
//		Scanner keyboard = new Scanner(System.in);
//
//		System.out.println( "Type in a message, and I'll display it five times." );
//		System.out.print( "Message: " );
//		String message = keyboard.nextLine();
//
//		int n = 0;
//		while ( n < 5 )
//		{
//			System.out.println( (n+1) + ". " + message );
//			n++;
//		}
//
//		Scanner keyboard1 = new Scanner(System.in);
//		int pin = 12345;
//		int tries = 0;
//
//		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
//		System.out.print("ENTER YOUR PIN: ");
//		int entry = keyboard1.nextInt();
//		tries++;
//
//		while ( entry != pin && tries < 4 )
//		{
//			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
//			System.out.print("ENTER YOUR PIN: ");
//			entry = keyboard1.nextInt();
//			tries++;
//		}
//
//		if ( entry == pin )
//			System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
//		else if ( tries >= 3 )
//			System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
//
//		
//		Scanner keyboard = new Scanner(System.in);
//
//		System.out.println( "Type in a message, and I'll display it five times." );
//		System.out.print( "Message: " );
//		String message = keyboard.nextLine();
//
//		int n = 0;
//		while ( n < 10)
//		{
//			System.out.println( (n+1) + ". " + message );
//			n++;
//		}

//		Scanner keyboard = new Scanner(System.in);
//		Random rng = new Random();
//		String again = new String ("y") ;
//	
//		
//		while ( again.equals("y") ) {
//			int flip = rng.nextInt(2);
//			String coin;
//			if ( flip == 1 )
//				coin = "HEADS";
//			else
//				coin = "TAILS";
//			System.out.println( "You flip a coin and it is... " + coin );
//			System.out.print( "Would you like to flip again (y/n)? " );
//			again = keyboard.next();
//		}
//	
//	
		for(int number = 1; number <= 100; number++) {
        
			if(number % 3 == 0) System.out.println("Fizz");
           
            else if(number % 5 == 0) System.out.println("Buzz");
          
            else if(number % (3*5) == 0) System.out.println("FizzBuzz");

            else System.out.println(number);
	}

	}
}
