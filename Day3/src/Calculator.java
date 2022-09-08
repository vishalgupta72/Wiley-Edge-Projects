import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    char operator;
    Double a, b, ans;

    Scanner sc = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = sc.next().charAt(0);

    System.out.println("Enter first number:");
    a = sc.nextDouble();

    System.out.println("Enter second number:");
    b = sc.nextDouble();
    ans = calculate(a, b, operator);
    
    System.out.println("Result is: "+ ans);
  }
  
  public static double calculate(double a, double b, char operator) {

	double ans = 0;
    switch (operator) {

      case '+':
        ans = a + b;

      case '-':
        ans = a - b;

      case '*':
        ans = a * b;

      case '/':
        ans = a / b;
    }
    
    return(ans);

  }
}