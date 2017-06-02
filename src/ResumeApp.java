//Java BootCamp
// @Author Genet Woldeyes
//Date 6/2/2017

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ResumeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int number;
Date date;
List<String> i = new ArrayList<String>(); 
String rating[]={"skilled", "proficient", "familiar"};

Resume myNewResume = new Resume();
print("First Name");
print("Last Name");
myNewResume.addAddress.getFirstName();
myNewResume.addAddress.getLastName();

print("Email Address");
myNewResume.addAddress.getEmailAddress();

print("Add your Educational Background");
print("Enter stop when you finish");
myNewResume.addEducation.getEducation();

print("Add your Work Experience");
print("Enter stop when you finish");
myNewResume.addWorkExperience.getNewExperience();

print("Add your Skills");
print("Enter stop when you finish");
myNewResume.addSkills.getSkills();

print(myNewResume.addAddress.displayFullName());
print(myNewResume.addAddress.displayaddress());
print(myNewResume.addAddress.displayFullName());
print("Education");

myNewResume.addEducation.setEducation(i);
myNewResume.addEducation.displayEducation(i);
myNewResume.addWorkExperience.setNewExperience(i);
myNewResume.addWorkExperience.displayExperience(i);
myNewResume.addSkills.setSkills(i);
myNewResume.addSkills.displaySkills(i);



	}
	
	private static void print(String s){
		
		
		System.out.println(s);
	}
}