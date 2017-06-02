import java.sql.Date;


public class Resume {
	
	ContactAddress addAddress;
	Education addEducation;
	WorkExperience addWorkExperience;
	Skills addSkills;
		
	public Resume(){
		
		this.addAddress = new ContactAddress();
		this.addEducation = new Education();
		this.addWorkExperience = new WorkExperience();
		this.addSkills = new Skills();
		
	}

}
