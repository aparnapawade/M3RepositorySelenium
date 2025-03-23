package arrayPrograms;

public class BasicsOfArray {

	public static void main(String[] args) {
		
		System.out.println(args);       //address
		System.out.println(args.length);  //size of array -- 0
		//compile line arguments --can pass to JVM before main method executes
		//through command prompt --firstly compile the file(javac filename.java)--
		//then execute and pass arguments as (java className arguments).
		//ex.java Demo Swami Bappa Gurudev
		
		//For negative array size
	//	int [] b = new int[-5];    
	//	System.out.println(b); //Will give NegativeArraySizeException and Array will not create
		
		//We can create 0 size array
		int[] a = {};
		System.out.println(a); //address
		System.out.println(a.length);  //0
		
		//We can not change size of array once it it created
	}
}
