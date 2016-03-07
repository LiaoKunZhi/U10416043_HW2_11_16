//U10416043   廖崑智

import java.util.Scanner;
import java.util.ArrayList;

//Class
class AnswerList{

	//Data field
	int number1;
	int number2;
	int answer;
	boolean k;

	//Create a list to save the number which user input
	ArrayList<Integer> answerList = new ArrayList<>();

	Scanner input = new Scanner(System.in);

	//Constructor
	AnswerList(int newNumber1, int newNumber2, int newAnswer){
		number1 = newNumber1;
		number2 = newNumber2;
		answer = newAnswer;
	}

	//Get method and set method
	void setNumber1(int newNumber1) {
		number1 = newNumber1;
	}

	int getNumber1() {
		return number1;
	}

	void setNumber2(int newNumber2) {
		number2 = newNumber2;
	}

	int getNumber2() {
		return number2;
	}

	void setAnswer(int newAnswer) {
		answer = newAnswer;
	}

	int getAnswer() {
		return answer;
	}
}
