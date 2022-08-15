package Trywothresuress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class autoclosiingrsures {
public static void main(String[] args) {
	
   // nned to clsoe by finally block fro cloing resureses
//try {
//	BufferedReader reader=new BufferedReader(new StringReader("hello world how are you"));
//	StringWriter wr=new StringWriter();
//	wr.write(reader.readLine());
//	System.out.println(wr.toString());
//	
//catch(IOException io) {
//	
//}
	// by usinf tryresures try() we can  add resures into try bracketssa
	try(BufferedReader reader=new BufferedReader(new StringReader("hello world how are you"));
			StringWriter wr=new StringWriter();) {
		
		
		wr.write(reader.readLine());
		System.out.println(wr.toString());
		
	}
//	try {
//		BufferedReader reader=new BufferedReader(new StringReader("hello world how are you"));
//		StringWriter wr=new StringWriter();
//		wr.write(reader.readLine());
//		System.out.println(wr.toString());
//		
	catch(IOException io) {
		
	}
}
}//hello world how are you
//hello world how are you // but here we need close manully resuoyes so we can use ontehr way called try with resures 
// nothing but try()  inside brcakets cut paste the resureses