package learning;
import java.util.Scanner;
public class multpleanswersquestions {
	public static void main(String[] args) {
		

String question=   "what is the largest planet in our solar sysytem ?";
String choiceone="Earth";
String choicetweo="Jupiter";
String choicethree="Saturn";
String choicefour="Neptune";


// THES USER FOR .tolowercase
//String choiceone="earth";
//String choicetweo="jupiter";
//String choicethree="saturn";
//String choicefour="neptune";
String corrcetAnswer=choicetweo;
//write print statment asking question 
//System.out.println(question);


//write a print statemnt giving the answers choices 
System.out.println("choose one of thw fallowing corrcet answers");
System.out.println("(a)"+" " +choiceone);
System.out.println("(b)"+" " + choicetweo);
System.out.println("(c)"+" " + choicethree);
System.out.println("(d)"+" " + choicefour);


//have the user input an answers by dynmically 
Scanner sc=new Scanner(System.in);
// retrive the user input
String input =sc.next();
//System.out.println(input);
//System.out.println(corrcetAnswer);
// iff users unput matches the correct Answers ...
//then the user is correct and we want print out a Congrats message to the user
// need to make user input as dynamic answer means what ever user enter like uppercase and lowercsae should takke equally so use tolowercase method
if(corrcetAnswer.equalsIgnoreCase(input)) {// we are user any case it will take 
//	if(corrcetAnswer.equals(input.toLowerCase())) {  // this can be sued when options are lower case+

	System.out.println("congrats your Answer is correct");
}else {
	System.out.println("Your Answer is Incorrect"+" The correct Answertss"+" " +corrcetAnswer);
}
	}
}
