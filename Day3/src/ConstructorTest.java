
public class ConstructorTest {
	
	int a, b;
	String c;

	public ConstructorTest() {
		this.a = 1;
		this.b = 2;
		this.c = "Apple";
	}
	
	public ConstructorTest(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public ConstructorTest(int a, int b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void display() {
		System.out.println("a is: "+this.a);
		System.out.println("b is: "+this.b);
		System.out.println("c is: "+this.c);
	}

}
