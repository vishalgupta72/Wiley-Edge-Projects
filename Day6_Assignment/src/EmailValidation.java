public class EmailValidation {
	private String email;
	
	public EmailValidation(String email) {
		this.email = email;
	}
	
	public String isValid() throws EmailException {
			
		String pattern = "[a-zA-Z0-9_/=?^`{|}~!#$%&'*+-]{1,}\\.{0,1}[a-zA-Z0-9__/=?^`{|}~!#$%&'*+-]{1,}@[a-z]+\\.com"; 
		
		if(!email.matches(pattern))
			throw new EmailException();
		
			
		return "Your email address is valid";
	}
	
	public static void main(String[] args) {
		EmailValidation email1 = new EmailValidation("sid0542@wiley.com");
		EmailValidation email2 = new EmailValidation("@sid0542gmail.com");
		
		try {
			System.out.println(email1.isValid());
		}
		
		catch(EmailException e) {
			System.out.println(e);
		}
		try {
			System.out.println(email2.isValid());
		}
		
		catch(EmailException e) {
			System.out.println(e);
		}
	}
	
}