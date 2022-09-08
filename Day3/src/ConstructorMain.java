
public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorTest constructorTest1= new ConstructorTest();
		ConstructorTest constructorTest2= new ConstructorTest(2, 4);
		ConstructorTest constructorTest3= new ConstructorTest(3, 6, "Mango");
		
		constructorTest1.display();
		constructorTest2.display();
		constructorTest3.display();
	}

}
