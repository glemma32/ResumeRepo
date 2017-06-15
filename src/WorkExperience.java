import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkExperience {
	
	String title, company, startDate, endDate, duty;
	ArrayList<String> duties  = new  ArrayList<String>();
	Scanner input = new Scanner(System.in);
	String choice_duty = "yes";
	
	
	
	public String getTitle() {
		title = input.next();
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCompany() {
		company = input.next();
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getStartDate() {
		startDate = input.next();
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		endDate = input.next();
		return endDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	

	public ArrayList<String> getDuties() {
		
		System.out.println("Enter duty");
			duty = input.nextLine();
			duties.add(duty);		   
			return  duties;
				
	}

	public void setDuties(ArrayList<String> duties) {
		this.duties = duties;
	}
	
	
		
	}

