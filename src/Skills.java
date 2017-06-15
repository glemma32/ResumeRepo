
import java.util.ArrayList;
import java.util.Scanner;

public class Skills {
	
	ArrayList<String> skillsRatings = new ArrayList<String>();
	//ArrayList<String> ratings = new ArrayList<String>();
	//ArrayList<String> skills = new ArrayList<String>();
	Scanner input,input2 = new Scanner(System.in);
	String skill, rating;
	
	public ArrayList<String> getSkillsRatings() {
		skill = input.nextLine();
		rating = input2.nextLine();
		//skills.add(skill);
		//ratings.add(rating);
		skillsRatings.add(skill + ", "+ rating  );
		return skillsRatings;
		
	}
 
	public void setSkillsRatings(ArrayList<String> skillsRatings) {
		this.skillsRatings = skillsRatings;
	}

}
