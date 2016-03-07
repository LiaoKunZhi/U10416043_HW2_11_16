//U10416043   廖崑智

import java.util.Scanner;

//Class
public class TestRepeatMultiplicationQuiz{

	//Main method
	public static void main(String[] args){
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);

		//Create a scanner
		Scanner input = new Scanner(System.in);

		//Show the question and answer it
		System.out.println("What is " + number1 + " * " + number2 + " ? ");
		int answer = input.nextInt();

		//Get the number to the next class
		AnswerList a = new AnswerList(number1,number2,answer);
		a.List();

		System.out.println("You got it!");
	}
}
