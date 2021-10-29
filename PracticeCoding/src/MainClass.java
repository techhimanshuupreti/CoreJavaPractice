import com.upreti.practice.stringrelated.StringRelatedMethods;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("hello");
		
		StringRelatedMethods stRelatedMethod = new StringRelatedMethods();
		String outside = stRelatedMethod.getIndexOfDuplicateCharacterInGivenString("I am Himanshu");
		System.out.println("outside = "+outside);
	}
}
