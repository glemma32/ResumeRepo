import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Resume {
	
	ContactAddress addAddress;
	Education addEducation;
	WorkExperience addExperience;
	Skills addSkills;
	//List<String> education = new ArrayList<String>();
	String choice_edu="yes",choice_duty = "yes", choice_exp="yes", choice_skill="yes";
	public String degree1, university1, gradDate1,
			title1, company1, start, end, first, 
			last, email, skill1, rating;
	Scanner input = new Scanner(System.in);
	String  title, company, startDate, endDate, duty;
	ArrayList<String> array_Duty = new ArrayList<String>();
	ArrayList<String> array_skill = new ArrayList<String>();

		
	public Resume(){
		
		this.addAddress = new ContactAddress();
		this.addEducation = new Education();
		this.addExperience = new WorkExperience();
		this.addSkills = new Skills();		
	}
	public void getResume(){
		
		print("First Name");
		print("Last Name");
		String first=addAddress.getFirstName();
		String last=addAddress.getLastName();
		print("Email Address");
		String email=addAddress.getEmailAddress();
		
		addAddress.setFirstName(first);
		addAddress.setLastName(last);
		addAddress.setEmailAddress(email);
		
		
		print("Add your Educational Background");
			
		while(choice_edu.equalsIgnoreCase("Yes"))
		{
		print("Enter your Degree");
		String degree1 =addEducation.getDegree();
		print("Enter the name of university you attended");
		String university1=addEducation.getUniversity();
		print("Enter the year you graduated or year you intended to graduate");
		String gradDate1=addEducation.getGradDate();
		
		addEducation.setDegree(degree1);
		addEducation.setUniversity(university1);
		addEducation.setGradDate(gradDate1);
		
		print("Do you want add more degree details? yes/no");
		choice_edu = input.next();
		
		}
		
		
		print("Add your professional experience");
		
		while(choice_exp.equalsIgnoreCase("Yes"))
		{
		print("Enter your position in the company");
		title1=addExperience.getTitle();
		print("Enter the company name ");
		company1=addExperience.getCompany();
		print("Enter the date you started");
		start=addExperience.getStartDate();
		print("Enter the date you end date");
		end =addExperience.getEndDate();
		
		    print("Enter your duties");	
	     	while(choice_duty.equalsIgnoreCase("Yes"))
		    {
		       array_Duty=addExperience.getDuties();
		       print("Do you want add more degree details? yes/no");
		       choice_duty = input.next();
		       addExperience.setDuties(array_Duty);
			}
	     	
	     	addExperience.setTitle(title1);
	    	addExperience.setCompany(company1);
	    	addExperience.setStartDate(start);
	    	addExperience.setEndDate(end);
	    		
		}
		
		
		while(choice_skill.equalsIgnoreCase("Yes"))
		{
		print("Enter your skills and and your proficiency as highly skilles, proficient, or familiar.");
		 array_skill =addSkills.getSkillsRatings();
	
		print("Do you want add more skills? yes/no");
		choice_skill = input.next();
		addSkills.setSkillsRatings(array_skill);
		}
		}
		

	public void displayResume(){
		
		print(first+ " "+last + "/n");
		print(email+ "/n");
		print("/n");
		print("/n");
		print("Education");
		print(degree1+","+"/n");
		print(university1+", "+gradDate1+"/n");
		print("/n");
		print("/n");
		print("Experience");
		print(title1);
		print(company1+", "+start+"-"+end+"/n");
		for(int i=0; i<array_Duty.size(); i++){
		print("-"+array_Duty+"/n");
		}
		print("/n");
		print("/n");
		print("Skills");
		for(int i=0; i<array_skill.size(); i++){
		print("-"+array_skill+"/n");
		}
		print("/n");
		print("/n");
		
		
	}
private static void print(String s){
		
		
		System.out.println(s);
	}
private static void print(ArrayList<String> a){
	
	
	System.out.println(a);
}
}
	
