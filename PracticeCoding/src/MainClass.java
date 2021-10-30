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
	}
}
