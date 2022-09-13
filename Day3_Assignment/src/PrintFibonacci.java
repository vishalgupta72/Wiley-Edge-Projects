import java.util.Scanner;

public class PrintFibonacci {

	public int fibFun(int n)
	{
		if (n <= 1)
			return n;

		return fibFun(n - 1) + fibFun(n - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintFibonacci printFibonacci = new PrintFibonacci();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a range:");
		int num = s.nextInt();

		
		System.out.println(num+" Fibonacci numbers are given below:");
		for (int i = 0; i < num; i++) {
			System.out.print(printFibonacci.fibFun(i) + " ");
		}
		
		s.close();
	}
	

}


