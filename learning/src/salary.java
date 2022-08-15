
public class salary {
public static double salarycalulator(double workinghoursperweek,double amountperhour,int vacctioDays) {
	
	if(workinghoursperweek<0) {// extra valtion what if user enterdf less 0
		return -1;
	}
	if(amountperhour<0) {// extra valtion what if user enterdf less 0
		return -1;
	}
	 double workindays =5;
	 double numberhoursperday=8;
double workinghoursperweek1 = workindays*numberhoursperday	;

double weeklyPaycheck=workinghoursperweek1*amountperhour;

double unpaidTime=vacctioDays*amountperhour*8;
return (weeklyPaycheck*52)-unpaidTime;

	
}
public static void main(String[] args) {
double salary=salarycalulator(40,15,8);
System.out.println(salary);
}
}
