package Employee;
import java.util.ArrayList;

public class  Hairdreser  {
	
	private String name;
	private ArrayList<String>daysavilable=new ArrayList();
	// constrcuetr
	public  Hairdreser (String name) {
		this.name=name;
	}

	// method
	public void setDayavilable(String...days) {// here passing Stringdtattype and varrags with all days need to set
		for(String day:days) {// here with foreachloop we are retving the data inthe name of days and stroing in day
			daysavilable.add(day);// usinh daysavilbe refrnec of arraylist we are adding day into list
		}
	}

	public void removeDay(String day) {
		if(daysavilable.contains(day)){// jsut cross checking if days are thre are not
			daysavilable.remove(day);// if this methiod invoked with sutiable data which contains(day) sastsfy s it will come to its implention
			// and removes 
		}
	}
	public ArrayList<String> getDaysavilble(){
		return daysavilable;
	}
	public String getName() {
		return name;
	}
		
	}


