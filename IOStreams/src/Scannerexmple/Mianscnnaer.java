package Scannerexmple;
import java.util.Scanner;
public class Mianscnnaer {
public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name of person");
     String name=sc.next();
     System.out.println("entre the age");
     int age=sc.nextInt();

     System.out.println("enter the phoneNumber");
     long phoneNumvber=sc.nextLong();
     // need to creat object call
     Scannerclass p=new Scannerclass(name, age, phoneNumvber);
}
}
//erson created name maheshage24phonenumbe8777
