package shcdulecalendr;
import    Employee.Hairdreser;
import  shcdulecalendr.sceduler;
public class Custmer {
	public static void main(String[] args) {
		
	
	sceduler sc=new sceduler();
	// need book to haircut for apomniment]
	sc.bookHaircut("Harry","Monady");
	//sc.bookHaircut("Jill","Ftriday");//Harryis not avilblee Monady
	//Jillis not avilblee Ftriday
	sc.bookHaircut("Jill","Friday");
	}
	//Harryis not avilblee Monady
	//you have blocked  Jillon day of  Friday

}
