import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkExperience {
				
		List<String> NewExperience = new ArrayList<String>();

		public List<String> getNewExperience() {
			
			// ArrayList arrayListOne;
			 //arrayListOne = new ArrayList();
			 Scanner inExperience = new Scanner(System.in);
				
			while(true) {
				String input = inExperience.nextLine();
				NewExperience.add(input);
			}
			}

		public void setNewExperience(List<String> newExperience) {
			NewExperience = newExperience;
		}
		
		public void displayEducation(ArrayList education) {
		    for(int i = 0; i < education.size(); i++) 
		      System.out.println(education.get(i));
		  }
		
		
	}

