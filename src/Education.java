import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Education {

	
	List<String> education;
	public Education(){
	education= new ArrayList<String>();
	}
	 public List<String> getEducation() {
		 
		 Scanner sc = new Scanner(System.in);
		 String inEducation = sc.nextLine();;
		 		 
		do
		 //while(!inEducation.equalsIgnoreCase("STOP"))
		
	 {
			 //String inEducation =sc.nextLine();
			//education.add(inEducation);
			//return inEducation;
			
			ArrayList arrayListOne;
		    arrayListOne = new ArrayList();   
		    inEducation = sc.nextLine();
		     education.add(inEducation);
		     
	 }
		      
		      //System.out.println("Number of string in array: " + letterArray.size());
		      // Display eveything in the list
		
		 //return education.add(inEducation);
	while(!inEducation.equalsIgnoreCase("STOP"));
	 //while(sc.nextLine() != "STOP");
		return this.education;
	 }
	public void setEducation(List<String> education) {
		this.education = education;
	}
	public ArrayList<String> displayEducation(List<String> education) {
	    for(int i = 0; i < education.size(); i++) 
	    		    
	    education.get(i);
	    return this.displayEducation(education);
	    
	}
	

		 
			
			
			 //System.out.println(l);
	 }
	
						
					