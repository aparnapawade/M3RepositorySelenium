package stringPrograms;

public class SwappingTwoStringsWithoutUsingExtraVariable {

	public static void main(String[] args) {
		
		String a = "Hi";
		String b = "Bye";
		System.out.println("==== Before swapping ====");
		System.out.println(a);
		System.out.println(b);
		
		int n = a.length();
		
		a = a + b;
		b = a.substring(0, n);
		a = a.substring(n);
		System.out.println("==== After swapping ====");
		System.out.println(a);
		System.out.println(b);
	}
}
//==== Before swapping ====
//Hi
//Bye
//==== After swapping ====
//Bye
//Hi