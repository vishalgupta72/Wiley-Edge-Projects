
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Even numbers:");
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
			
			else if(i > 10) {
				break;
			}
			
		}
		System.out.println("Odd numbers:");
		int j = 1;
		while(j < 100) {
			if(j % 2 == 0) {
				j++;
				continue;
			}
			else if(j > 10) {
				break;
			}
			else {
				System.out.println(j);
			}
			j++;
		}
		
		System.out.println("Natural numbers:");
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}
		while(i <= 10);

	}

}
