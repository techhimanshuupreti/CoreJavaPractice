import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.upreti.practice.arrayrelated.ArrayRelated;
import com.upreti.practice.stringrelated.StringRelatedMethods;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("hello");
		
		StringRelatedMethods stRelatedMethod = new StringRelatedMethods();
		String outsides = stRelatedMethod.getIndexOfDuplicateCharacterInGivenString("I am Himanshu");
		System.out.println("outside = "+outsides);
		
		ArrayRelated arrRelated = new ArrayRelated();
		List<Object> returnList = new ArrayList<Object>();
		returnList.add("Jai");
		returnList.add("Himanshu");
		returnList.add("Upreti");
		returnList.add("Jai");
		returnList.add("OM");
		returnList.add("Jai");
		
		System.out.println("List= "+arrRelated.removeDuplicate(returnList).toString());
		
		
	}
}
