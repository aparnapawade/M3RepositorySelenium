package numberPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
	//Fibonacci Series till 10 : 0 1 1 2 3 5 8 13 21 34	
		int num = 10;
		int fib1 = 0;
		int fib2 = 1;
		if(num == 1)
		{
			System.out.println(fib1);
		}
		else if(num == 2)
		{
			System.out.println(fib2);
		}
		else if(num > 2)
		{
			System.out.println(fib1);
			System.out.println(fib2);
			for(int i=3; i<=num; i++)
			{
				int fib3 = fib1 + fib2;
				System.out.println(fib3);
				fib1 = fib2;
				fib2 = fib3;
			}
		}
	}
}
