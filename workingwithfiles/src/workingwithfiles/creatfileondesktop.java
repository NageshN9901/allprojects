package workingwithfiles;

import java.io.File;
import java.io.IOException;

public class creatfileondesktop {
public static void main(String[] args) {
	File myfile=new File("C:\\Users\\nages\\OneDrive\\myfile.txt");
	try {
		boolean filecreate=myfile.createNewFile();
		System.out.println(filecreate);
	}catch(IOException i) {
		
	}
}
}//true so filke is created
