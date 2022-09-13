import java.util.Scanner;

public class Date {
	
	int dd, mm, yy;
	
	
	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public String displayDate() {
		return(dd+"/"+mm+"/"+yy);
	}
	
	public boolean checkDate() {
		if(this.dd>31 || this.mm < 1)
			return false;
		if(this.mm > 12 || this.mm < 1)
			return false;
		if(this.yy < 0)
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int dd = s.nextInt();
		int mm = s.nextInt();
		int yy = s.nextInt();
		
		Date date = new Date(dd, mm, yy);
		if(date.checkDate())
			System.out.println(date.displayDate());
		else
			System.out.println("Date is invalid!");
		
		s.close();
		
	}

}
