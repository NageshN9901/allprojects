
public class StudentProfile {
String firstName;
String LastName;
String Branch;
double GPA;
int expectedYearToGrdaute;

public StudentProfile(String firstName,String LastName,String Branch,double GPA,int expectedYearToGrdaute) {
	
	this.firstName=firstName;
	this.LastName=LastName;
	this.Branch=Branch;
	this.GPA=GPA;
	this.expectedYearToGrdaute=expectedYearToGrdaute;
	
}
public void incrementExceptedYearGrdautio() {
	this.expectedYearToGrdaute=expectedYearToGrdaute+1;
}
//main
}
