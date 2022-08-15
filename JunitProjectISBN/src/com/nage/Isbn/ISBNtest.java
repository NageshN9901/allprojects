package com.nage.Isbn;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;
import org.junit.Test.*;




public class ISBNtest {
private static final int LONGT_ISBN_MULTI = 10;
private static final int SHART_ISBN_MULTI = 11;
private static final int SHART_ISBN_LENGTH = 10;
private static final int LONG_ISBN_LENGTH = 13;
// @Test is must other wose that method will not run
	@Test    // this test means which method wr are tesing or testing methods
	public void CheckValidater10digitISBN() {
		//fail("Not yet implemented");
		// >>>> 1st step fail() method is used fail the method given by Junit
		// create objcet for class
		ISBNtest validater= new ISBNtest();
		// need to call method and pass isbn code need to store in continer
		boolean result=validater.checkISBN("0140449116");// number is book isbnb checkisbn method implented in onether class
		// we have removed 0 in 0140449116 becuse int cant take that much long we nned fix it later
		assertTrue("fisrtvalue",result);// we will get notin that wher we have error by adding string but need import 
		// wr adding onerg isbn 
		result=validater.checkISBN("0140177396");// result means adding output 
		assertTrue("second tvalue",result);// here its hoing srror
	}
		// now need create 10 dogit isbn with last digit X is valid
	@Test
	public void ISBN10digitcanHaveXatEnd() {
		ISBNtest validater= new ISBNtest();
		boolean result=validater.checkISBN("012000030X");// now we are geting isbn have only numric like that
	}
	@Test
	public void ISBNwith13digit() {
		//fail():
		ISBNtest validater= new ISBNtest();
		boolean result=validater.checkISBN("9781853260087");// now we are geting isbn have only numric like that

		assertTrue("first value",result);
		result=validater.checkISBN("9781853267338");// result means adding output 
		assertTrue("secondvalue",result);
		
	}
	// need chacek invalid 13 dit so cahnfe lasdt digit why means accronfing calcalution we willl get integer only if not its invalid
	@Test
	public void checkISBNInvalid13digit() {
		//fail();
		ISBNtest validater= new ISBNtest();
		boolean result=validater.checkISBN("9781853267336");// now we are geting isbn have only numric like that

		assertFalse(result);// becuse we are given wrong data here so thats why given asserFalse
	}
	// NOW RUN RED SO WENEED TO DO IMPLENTION TO GWT GREEN
	
	// run but geteing red so some code to get pass 
// now need to make secon test stpes
		// red fail and green pass and Refacr  // 2nd method
	@Test
		public void CheckINValidater10digitISBN() {
			ISBNtest validater= new ISBNtest();
			// chnage the number of isbn 
			//boolean result=validater.checkISBN(140449117);
			boolean result=validater.checkISBN("0140449117");// becuse string will accept any diguits 
			// why false means need to pass code
			// if we taken assrtTrue means it will gives always pass green thats way rule onw is make fail thats way false
			//fail(); every time before we need fail 
			assertFalse(result);
	}
	
	// 3rd testpas
	@Test(expected=NumberFormatException.class)
	public void ninedigitISBNnotAllowed() {
		//fail(); //fisrt step
		ISBNtest validater= new ISBNtest();
//		boolean result=
		validater.checkISBN("123456789");// here passing exception test itself
		
	}
	// just for prcatice helloworld -10digit so wera makeing same ablove code
	@Test(expected=NumberFormatException.class)
	public void  nonNumricISBNS() {
		//fail(); //fisrt step
		ISBNtest validater= new ISBNtest();
//		boolean result=
		validater.checkISBN("helloworld");// here passing exception test itself
		
	}

// now second tep for 2nd method need to pass

	//private boolean checkISBN(int isbn) {
	private boolean checkISBN(String isbn) {// String means to take 10digits after upfdateding to strin once chscek by running
		
	// >>>>now second step is make our code green means test pass not botherinh functnaltys
		//return false;
		//now second step for second method we are making seting true to gte green
		///temp///if(isbn=="0140449116") {// we are cganfe integer to string type
		///temp///return true;// we have want pass by assertion that way we need get green // done
		///temp///}
	///temp///return false;// now its 
		// now removeing all code to write acutlly code in the name of Tempis temparry code
		//>> this parcular when we ahce 13 digitt
		//if(isbn.length()==13) return true;
		// NOW NNEDD TO EXTARCT CONSTNT FROM CODE 10 AND 13 SELCT 13 FISRT
		if(isbn.length()==LONG_ISBN_LENGTH) {// here what we are doing is islemgthshoert or islengthlomg or throwerror but need same logic
			// now step refrcting move some code which is question that isvalid 13digitnum,brebwlow code
			return isThisValidLONgISBN(isbn);// this code is refacrted this is new craetd method by refract
			
		}// if else means need rerun isthidshortisbn method so add in else
		else if(isbn.length()==SHART_ISBN_LENGTH){// we are amking ISBN=10 then enter
	return isTHisValidShortISBN(isbn);// retrun this method hre we ahv esame cod if pass it willretrun otherwise it will ove throws an error
		// actual
	// to store our methmtic formul is multple each digit with 10 9 8 upto 1 with corsponging digts and dividy by 11 so if its is int
		// its isbn if its decimal its not isbn
		// throw exception when we have 9 digits
		// HERE MAKE 10 AS SHORTISBNLENGTH BY REFCRT EXTRCT CONSTNAT
		//if(isbn.length()!=SHART_ISBN_LENGTH)throw new NumberFormatException("ISBN must be 10 digits");// this is for 10digit code Check
		// NOW IN DEBUGING MODE FOR 0 ITERTION ITS TAKING 480 MEANS 10*0 TAKINH 0 ASCII VALUE 
		//return isTHisValidShortISBN(isbn);// SECOND METHOD RECTRED 
	}
		throw new NumberFormatException("ISBN must be or  and 13 digits");// becsue we are done with both methods 10 and  11 if we both not passed means it will reach here
	}
	// SECOND METHOD RECTRED 	// RENAMEED METHOD NAME USING REFACTOR

	private boolean isTHisValidShortISBN(String isbn) {
		int total=0; // intally taken
		for (int i = 0; i <SHART_ISBN_LENGTH; i++) {// chmaged 10 into its varble name
			// need to check and pass evry digit should be numric
			if(!Character.isDigit(isbn.charAt(i))){
				if(i==9 && isbn.charAt(i)=='X') {// still we have red
	// when last digit 10 *1 is not possible so we need add that digit total this is also b

			}else {throw new NumberFormatException("isbn only have numric digits only");// now we get green for nonNUmric method
			}
			}else {
// HERE TOTAL MAKING 480 SO W ENED CHANG BECUSE IT INDRIECTLY NULYPLYING THE VALUES WITJH ASCCI CALUES SO USE Cherceter.getNum
			total+= Character.getNumericValue(  isbn.charAt(i)) *(SHART_ISBN_LENGTH-i);}}// hee stroing into total and isbn as all string isbn data.chaAt(meeans it will convert each string data inyo
			//checrcter itwill be numric *(10-i) means formula says each isbn number digit need mulpltesys with 10 9 8 7 and upto 1
		// now need recahnfe in if as return
			return(total%SHART_ISBN_MULTI==0); // remove else statmnents
//					{     // now formula says need total /11
//				// remove else statmnents
//		return true;
//		}
//		else {
//			return false;
//		}
	}
	// here its new created refracting method 1
	// RENAMEED METHOD NAME USING REFACTOR
private boolean isThisValidLONgISBN(String isbn) {
	int total=0;
	for(int i=0; i<LONG_ISBN_LENGTH; i++) {// HREE CHNAGES 13 TO LONG ISBN LENGTH
		if(i%2==0) {
		total+= Character.getNumericValue(  isbn.charAt(i))*1;
		
		}else {
			total+= Character.getNumericValue(  isbn.charAt(i))*3;
		}
	}
	// rename if as return and delete else staments
	return(total %LONGT_ISBN_MULTI == 0);
//			{
//		return true;
//	}else {
//		return false;
//	}
}
}
