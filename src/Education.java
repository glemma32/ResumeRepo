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
		 		 
		//do
		 while(!inEducation.equalsIgnoreCase("STOP"))
	 {
			 //String inEducation =sc.nextLine();
			//education.add(inEducation);
			//return inEducation;
			
			ArrayList arrayListOne;
		    arrayListOne = new ArrayList();   
		    inEducation = sc.nextLine();
		     education.add(inEducation);
		     
	 }
		     
		     return this.education;
		  
		      //System.out.println("Number of string in array: " + letterArray.size());
		      // Display eveything in the list
		
		 //return education.add(inEducation);
	 }
		   
	public void setEducation(List<String> education) {
		this.education = education;
	}

	public void displayEducation(ArrayList education) {
		    for(int i = 0; i < education.size(); i++) 
		      System.out.println(education.get(i));
		  }

		 
			
			
			 //System.out.println(l);
	 }
	
						
					