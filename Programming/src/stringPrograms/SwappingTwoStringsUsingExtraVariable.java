package stringPrograms;

public class SwappingTwoStringsUsingExtraVariable {

	public static void main(String[] args) {
		
		String a = "Hi";
		String b = "Bye";
		System.out.println("==== Before swapping ====");
		System.out.println(a);
		System.out.println(b);
		
		String temp = a;
		a = b;
		b = temp;
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