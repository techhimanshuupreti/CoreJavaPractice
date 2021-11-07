import com.upreti.practice.date.DateRelated;
import com.upreti.practice.stringrelated.StringRelatedMethods;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("hello");
		
		StringRelatedMethods stRelatedMethod = new StringRelatedMethods();
		String outsides = stRelatedMethod.getIndexOfDuplicateCharacterInGivenString("I am Himanshu");
		System.out.println("outside = "+outsides);

		DateRelated dateRelated = new DateRelated();
		System.out.println("outside = "+dateRelated.findWeekDayName(9, 21, 2021));
		
		
		StringRelatedMethods strRelatedMethods = new StringRelatedMethods();
//		String A="hello";
//      String B= "java";
		String A = "java";
		String B = "hello";
		String outputMethod = strRelatedMethods.methodName(A, B);
		System.out.println("Output: " + outputMethod);

		String sortDictioary = strRelatedMethods.subStringWithThreeCharAndSorWithDictionary("I am himanshu", 3);
		System.out.println("Output: " + sortDictioary);
		
		CurrencyRelated cuuRe = new CurrencyRelated();
		System.out.println("Output: " + cuuRe.getCurrencyFormatWithSysmbol(12400.00d, Locale.CHINA));

	}
}
