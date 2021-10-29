package com.upreti.practice.arrayrelated;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayRelated {

	public List<Object> removeDuplicateByCollectionMetheds(List<Object> arrayList) {
		List<Object> returnList = new ArrayList<Object>();
		Set<Object> removeDuplicateString = new HashSet<Object>(arrayList);
		returnList.add(removeDuplicateString);
		return returnList;
	}
	
	
}
