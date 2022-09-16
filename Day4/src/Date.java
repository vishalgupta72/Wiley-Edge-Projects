import java.util.Scanner;

public class Date {
	
	private int dd, mm, yy;
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public String displayDate() {
		
		if(!checkDate())
			return "Date is invalid!";
		System.out.println("Date is valid!");
		return(dd+"/"+mm+"/"+yy);
	}
	
	public boolean checkDate() {
		if(mm < 1 || mm > 12 || dd < 1 || dd > 31 || yy < 1)
			return false;
		
		if(mm == 2) {
			
			if(!isLeapYear(yy)) {
				if(dd > 28)
					return false;
			}
			
			else {
				if(dd > 29)
					return false;
			}
		}
		
		else if(mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			if(dd > 30)
				return false;
		}
		
		return true;
	}
	
	private boolean isLeapYear(int year) {
		
		if(year%4 != 0)
			return false;
		
		else if(year%100 != 0)
			return true;
		
		else if(year%400 == 0)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int dd = s.nextInt();
		int mm = s.nextInt();
		int yy = s.nextInt();
		
		Date date = new Date(dd, mm, yy);
		System.out.println(date.displayDate());
		
		s.close();
		
	}

}
