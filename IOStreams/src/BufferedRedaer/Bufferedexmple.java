package BufferedRedaer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedexmple {
public static void main(String[] args) {
	// now we need read file in system but we keeped that file in same foledr 
	// now i need read in line by line
	// create File objcet pass file name
	File myfile=new File("my.txt");
	// need create biffered raeder object we we craeting buffred raeder which gives exception so we need surend with try catch blck
	try {
		BufferedReader reader=new BufferedReader(new FileReader(myfile));// myfile ivesexception 
		String line;
		while((line=reader.readLine())!=null){
			System.out.println(line);
			
		}
		} catch (IOException e) {
	}
	}
}
/////gfgffg
//hjh
//jj
//bjh
