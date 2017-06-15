import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Education {

	
	
	String degree,
	university, gradDate, choice="";
	

	
	public String getDegree() {
		Scanner input = new Scanner(System.in);
		degree = input.next();
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getUniversity() {
		Scanner input = new Scanner(System.in);
		university = input.next();
		return university;
		}


	public void setUniversity(String university) {
		this.university = university;
	}


	public String getGradDate() {
		Scanner input = new Scanner(System.in);
		gradDate =  input.next();
		return gradDate;
	}


	public void setGradDate(String gradDate) {
		this.gradDate = gradDate;
	}
	
	 
	    
	}
	
	 
						
	 				