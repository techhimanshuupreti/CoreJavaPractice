package com.upreti.practice.stringrelated;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringRelatedMethods {

	public String strPalridomWithSpaceRemoveDot(String str) {
		int size = str.split(" ").length;
		String[] temp = str.split(" ", size);
		String positonRevWithWhiteSplaceRep = "";
		for (int t = size-1; t >=0; t--) {
			if(t==0) {
				String splitStr = temp[t].replace(".", "");
				positonRevWithWhiteSplaceRep = positonRevWithWhiteSplaceRep + splitStr;
			}else {
				String splitStr = temp[t].replace(".", "")+ ".";
				positonRevWithWhiteSplaceRep = positonRevWithWhiteSplaceRep + splitStr;
			}
		}
		positonRevWithWhiteSplaceRep.replaceAll(" ",".");
		return positonRevWithWhiteSplaceRep;
	}

	
	public String duplicateCharactersInGivenStringUsingMap(String string) {
		String str = string.toLowerCase();
		   Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		   char[] arr = str.toCharArray();

		   for (char value: arr) {

			  if (Character.isAlphabetic(value)) {
				  if (charMap.containsKey(value)) {
					  charMap.put(value, charMap.get(value) + 1);

				  } else {
					  charMap.put(value, 1);
				  }
			  }
		   }
		   
		 //Obtaining set of keys
		   Set<Character> keys = charMap.keySet();
		
		   /* Display count of chars if it is
			* greater than 1. All duplicate chars would be 
			* having value greater than 1.
			*/
		   for(Character ch:keys){
			 if(charMap.get(ch) > 1){
			   System.out.println("Char "+ch+" "+charMap.get(ch));
			 }
		   }
	   
	   return charMap.toString();
   }
   
   public String duplicateCharacterInGivenString(String str) {
	   System.out.println("String Input: " + str);
	   String localStr = (str.trim()).replace(" ", "");
	   char[] ch = localStr.toCharArray();
	   String returnStr ="";
	   HashMap<String, Integer> mappedValues = new HashMap<String, Integer>();
	   for (int index = 0; index < ch.length; index++) {
		   if (mappedValues.containsKey(String.valueOf(ch[index]))) {
			   for (int indexj = index; indexj < ch.length; indexj++) {
				   if (ch[index] == ch[indexj]) {
					   String keyName = String.valueOf(ch[index]);
					   int val = mappedValues.get(keyName)+1;
					   mappedValues.put(String.valueOf(ch[index]), val);
				   }
			   }
		   } else {
			   mappedValues.put(String.valueOf(ch[index]), 1);
		   }
	   }
	   
		 //Obtaining set of keys
		   Set<String> keys = mappedValues.keySet();
		
		   /* Display count of chars if it is
			* greater than 1. All duplicate chars would be 
			* having value greater than 1.
			*/
		   for(String chs:keys){
			 if(mappedValues.get(chs) > 1){
			   returnStr = returnStr+" no. of occurences = "+ chs+" "+mappedValues.get(chs)+",";
			 }
		   }
	   return returnStr.replaceFirst(" ", "");
   }
   
   public String wordRevserBySeparator(String str,String separator) {
	   String revserString="";
	   int breakStringWordSize = str.split(separator).length;
	   
	   String[] breakString = str.split(separator, breakStringWordSize);
	   
	   for(String s : breakString){
		   revserString = revserString+ breakString[--breakStringWordSize]+" ";
	   }
	   return revserString;
   }
   
   public String getIndexOfDuplicateCharacterInGivenString(String str) {
	   System.out.println("String Input: " + str);
	   String localStr = (str.trim()).replace(" ", "");
	   char[] ch = localStr.toCharArray();
	   String returnStr ="";
	   HashMap<String, Integer> mappedValues = new HashMap<String, Integer>();
	   for (int index = 0; index < ch.length; index++) {
		   if (mappedValues.containsKey(String.valueOf(ch[index]))) {
			   for (int indexj = index; indexj < ch.length; indexj++) {
				   if (ch[index] == ch[indexj]) {
					   String keyName = String.valueOf(ch[index]);
					   int val = mappedValues.get(keyName)+1;
					   mappedValues.put(String.valueOf(ch[index]), val);
				   }
			   }
		   } else {
			   mappedValues.put(String.valueOf(ch[index]), 1);
		   }
	   }
	   
		 //Obtaining set of keys
		   Set<String> keys = mappedValues.keySet();
		
		   /* Display count of chars if it is
			* greater than 1. All duplicate chars would be 
			* having value greater than 1.
			*/
		   int count=0;
		   for(String chs:keys){
			   count++;
			 if(mappedValues.get(chs) > 1){
				 int incrVal = count;
			   returnStr = returnStr+ chs+" "+incrVal+",";
			 }
		   }
	   return returnStr.replaceFirst(" ", "");
   }
   
 	public String methodName(String A, String B) {
		int strLengthSum = A.length() + B.length();
		char[] aCh = A.toCharArray();
		char[] bCh = B.toCharArray();

		String decissionResult, combineString;

		if ((A.length() > B.length())) {
			if (aCh[0] > bCh[0]) {
				decissionResult = "Yes";
			} else {
				decissionResult = "No";
			}
		} else {
			if (aCh[0] > bCh[0]) {
				decissionResult = "Yes";
			} else {
				decissionResult = "No";
			}
		}

		String oA = A.substring(0, 1).toUpperCase();
		A = oA + A.substring(1, A.length());
		String oB = B.substring(0, 1).toUpperCase();
		B = oB + B.substring(1, B.length());
		combineString = A + " " + B;
		return String.valueOf(strLengthSum) + " | " + decissionResult + " | " + combineString;
	}
	
	public String subStringWithThreeCharAndSorWithDictionary(String str, int subStringlength) {
		String testingString =  str.trim().replace(" ", "").toLowerCase();
		HashSet<String> uniqueElements = new HashSet<String>(); 
		for(int i=0; i<testingString.length();i++) {
			if(i<=testingString.length()-subStringlength) {
				uniqueElements.add(testingString.substring(i,i+subStringlength));	
			}
		}
		
		ArrayList<String> flower_array = new ArrayList<String>(uniqueElements);
		Collections.sort(flower_array);
		String smallest =flower_array.get(0);
		String largest =flower_array.get(flower_array.size()-1); 
		return "[ "+ smallest +" , "+ largest + " ]";
	}
}
