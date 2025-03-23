package stringPrograms;

public class InitCapOfSentence {

	public static void main(String[] args) {
		
		String input = "i nEed soME SPacE";
		String res = "";
		
		String[] arr = input.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			String temp = arr[i];
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
			res = res + temp + " ";
		}
		res = res.trim();
		System.out.println(res);
	}
}
//I Need Some Space
