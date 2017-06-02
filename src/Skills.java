import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skills {
	
	String rating[]={"skilled", "proficient", "familiar"};
	List<String> skills = new ArrayList<String>();
		 
		public List<String> getSkills() {
			
			Scanner inSkills = new Scanner(System.in);
			while(true) {
				String input = inSkills.nextLine();
				skills.add(input);
			}
		
		}

	public void setSkills(List<String> skills) {
		
		for(int i = 0; i < skills.size(); i++) 
		      System.out.println(skills.get(i));
		this.skills = skills;
	}

		
}
