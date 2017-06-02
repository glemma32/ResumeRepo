import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class Resume {
	
	ContactAddress addAddress;
	Education addEducation;
	WorkExperience addWorkExperience;
	Skills addSkills;
	//List<String> education = new ArrayList<String>();
		
	public Resume(){
		
		this.addAddress = new ContactAddress();
		this.addEducation = new Education();
		this.addWorkExperience = new WorkExperience();
		this.addSkills = new Skills();
		
	}
	/*public List<String> displayEducation(List<String> education) {
	    for(int i = 0; i < education.size(); i++) 
	    		    
	    education.get(i);
	    return this.displayEducation(education);
	    
	}*/

}
