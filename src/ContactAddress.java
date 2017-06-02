import java.util.Scanner;

public class ContactAddress {
	
	String firstName, lastName, emailAddress;
	
	
	public String getFirstName() {
		
		Scanner FName = new Scanner(System.in);
		firstName = FName.next();
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		
		Scanner LName = new Scanner(System.in);
		lastName = LName.nextLine();
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		Scanner EAddress = new Scanner(System.in);
		emailAddress = EAddress.nextLine();
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String displayFullName(){
		return firstName + " " + lastName;
	}
	public String displayaddress(){
		return emailAddress;
		
	}

}