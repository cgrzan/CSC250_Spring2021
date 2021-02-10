import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
			/*
			 * Write a Java program that defines a String variable
			 *  and then creates a loop that goes through every character
			 *   in the String and counts the number of vowels 
			 *   (a,e,i,o,u,A,E,I,O,U) it finds.  Display the vowel 
			 *   count to the screen.  
			 */
		Scanner in = new Scanner (System.in);
		System.out.println("What's the Word?");
				
		String name = in.next();
			
		int vals = 0;
		
		for (int i = 0; i < name.length(); i++) {
			String temp = Character.toString(name.charAt(i));
			
			if(temp.equals("a")|| temp.equals("e")|| temp.equals("i")
					|| temp.equals("o")|| temp.equals("u")|| temp.equals("A")
					|| temp.equals("E")|| temp.equals("I")|| temp.equals("O")
					|| temp.equals("U")) {
			
				vals++;
			
	}
		
	}
		System.out.println("There are " + vals + " vowels.");
	}
			
			
	}


