
public class FirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] {5, 6, 7, 8, 7, 6, 5};
		int[] brr = new int[] {5, 6, 7, 8, 9, 10, 11};
		
		if(check(arr)) {
			System.out.println("First and Last elements are same!");
		}
		else {
			System.out.println("First and Last elements are different!");
		}
		
		if(check(brr)) {
			System.out.println("First and Last elements are same!");
		}
		else {
			System.out.println("First and Last elements are different!");
		}
		
	}
	
	public static boolean check(int[] arr) {
		if(arr[0] == arr[arr.length-1])
			return true;
		return false;
	}

}
