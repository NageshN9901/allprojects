package workingwithfiles;

import java.io.File;
import java.io.FilenameFilter;

public class workwithdirectryes {

	// toretrive files only bny apling filter
	public static void main(String[] args) {
		
	
	FilenameFilter filter=(file, fileName)->{
		return fileName.contains(".");
	};
	String[] cont=new File(".").list(filter);
	for(String file:cont) {
		System.out.println(file);//.classpath
//		.gitignore
//		.project
//		.settings

	}
	// to create new directery
	new File("mydirecter").mkdir();// will create new directryes
}
}