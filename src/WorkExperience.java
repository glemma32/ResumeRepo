import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkExperience {
				
		List<String> experience;
		
	public WorkExperience(){
		
		experience = new ArrayList<String>();

	}
		public List<String> getNewExperience() {
			
			// ArrayList arrayListOne;
			 //arrayListOne = new ArrayList();
			 Scanner inExperience = new Scanner(System.in);
			 String input = inExperience.nextLine();
				
			do {
				 input = inExperience.nextLine();
				experience.add(input);
			}
			
			while(!input.equalsIgnoreCase("STOP"));
			 //while(sc.nextLine() != "STOP");
				return this.experience;
			
			}

		public void setNewExperience(List<String> newExperience) {
			this.experience = experience;
		}
		
		public void displayExperience(List<String> experience) {
		    for(int i = 0; i < experience.size(); i++) 
		      System.out.println(experience.get(i));
		    
		  }
		
		
	}

