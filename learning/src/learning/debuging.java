package learning;
import java.util.Scanner;
public class debuging {
public static void main(String[] args) {
	System.out.println("lets calculate the area of triangle");
Scanner sc=new Scanner(System.in);
System.out.println("please input the base of  triangle (in inches ).");
	double base =sc.nextDouble();// for intally stage taking user input for comoparing
	// extra validtion
	while(base<=0) {
		System.out.println("thats invalid Please input the base triangle (in inches)");
		base =sc.nextDouble();// if user enter less then 0 it will atke ask onther time for user input
		
	}
	System.out.println("Please Enter input of the height of thew triangle (in inches");

	double height =sc.nextDouble();// for intally stage taking user input for comoparing
	while(height<=0) {
		System.out.println("please enter height triangle  (in inches) ");
		base =sc.nextDouble();
		
	}
	double area=(base*height)/2;
	System.out.println(height);
}
}
