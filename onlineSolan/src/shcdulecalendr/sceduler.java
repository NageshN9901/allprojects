package shcdulecalendr;
import java.util.HashMap;
import Employee.Hairdreser;// to take all avilbale inthis calss froikm that package
import java.util.ArrayList;

public class sceduler {
	private static HashMap<String, Hairdreser>hairdressMap=new HashMap();// creasted map with to stote key and par values
	
	// const
	public  sceduler() {
		
		Hairdreser harry=new  Hairdreser("Harry");
		Hairdreser jill=new  Hairdreser("Jill");
		// now need to make harry and jill avilbel dates
		harry.setDayavilable("monady","tuesday");
		jill.setDayavilable("Friday");
		// adding key and value to map
		hairdressMap.put("Harry",harry );// k=name value =refrnce 
		hairdressMap.put("Jill",jill );
		
	}
	// method
		public void bookHaircut(String hairdresrNmae,String day) {
			Hairdreser hairdr=hairdressMap.get(hairdresrNmae);// st be same using hashmap refrnce to get Nmaeofhairdress
			// to know what are the days avilbkle 
			ArrayList<String>dayscheck=hairdr.getDaysavilble();//here we are chceking with refrnce of class hiardresser)
			if(dayscheck.contains(day)) {// taken arugmnet name must be same
				System.out.println("you have blocked "+" "+ hairdresrNmae+"on day of"+ " "+ " "+day);
				// need to remove that day now becuse that no longer present
				hairdr.removeDay(day);//calling the method with class refnce which class has that method
				
				
			}
			else {
				System.out.println(hairdresrNmae+"is not avilblee"+" "+ day);
			}
		}
	
	
	
	
	

}
