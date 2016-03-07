//U10416043   廖崑智

import java.util.Scanner;

//Class
public class TestRepeatAdditionQuiz{

	//Main method
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		//Create a scanner
		Scanner input = new Scanner(System.in);

		//Show the question and answer it
		System.out.println("What is " + number1 + " * " + number2 + " ? ");
		int answer = input.nextInt();
		
				System.out.println("You got it!");
	}
}
