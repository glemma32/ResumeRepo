import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skills {
	
	String rating[]={"skilled", "proficient", "familiar"};
	List<String> skills;
	public Skills(){
		skills = new ArrayList<String>();
		
	}
		public List<String> getSkills() {
			
			Scanner inSkills = new Scanner(System.in);
			String input;
			
			do {
				input = inSkills.nextLine();
				skills.add(input);
			}
			while(!input.equalsIgnoreCase("STOP"));
			 //while(sc.nextLine() != "STOP");
				return this.skills;
		}

	public void setSkills(List<String> skills) {
		
		for(int i = 0; i < skills.size(); i++) 
		      System.out.println(skills.get(i));
		this.skills = skills;
	}
	public List<String> displaySkills(List<String> skills) {
	    for(int i = 0; i < skills.size(); i++) 
	      skills.get(i);
	    return this.skills;
	}
}
