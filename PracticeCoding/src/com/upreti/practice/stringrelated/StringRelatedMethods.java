package com.upreti.practice.stringrelated;

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
}
