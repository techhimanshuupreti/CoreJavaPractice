package com.upreti.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayToString {

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
}