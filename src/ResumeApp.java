import java.sql.Date;

public class ResumeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int number;
Date date;
String rating[]={"skilled", "proficient", "familiar"};
		
/*String[] elements = { "a", "a", "a", "a" };

for( int i = 0; i < elements.length - 1; i++)
{
    String element = elements[i];
    String nextElement = elements[i+1];
}*/
		for(number=1;number<=100;number++){
			//education
		}
			if((number%3==0)&&!(number%5==0))
			System.out.println("Fizz");
			else if(number%5==0&&!(number%3==0))
				System.out.println("Buzz");
			else if((number%3==0)&&(number%5==0))
				System.out.println("FizzBuzz");
			else
				System.out.println(number);

	for(number=1;number<=100;number++){
		//workexperience
	}
		if((number%3==0)&&!(number%5==0))
		System.out.println("Fizz");
		else if(number%5==0&&!(number%3==0))
			System.out.println("Buzz");
		else if((number%3==0)&&(number%5==0))
			System.out.println("FizzBuzz");
		else
			System.out.println(number);

for(number=1;number<=100;number++){
	//Skills
}
	if((number%3==0)&&!(number%5==0))
	System.out.println("Fizz");
	else if(number%5==0&&!(number%3==0))
		System.out.println("Buzz");
	else if((number%3==0)&&(number%5==0))
		System.out.println("FizzBuzz");
	else
		System.out.println(number);
	
}