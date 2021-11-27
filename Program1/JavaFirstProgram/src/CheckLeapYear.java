//Just for test purpose - This line is com form TestBranch1.
public class CheckLeapYear {
	public static void main(String[] argh) {
		int year = 1992;
		
		if(year % 400 == 0) {
			System.out.println("Leap year");
		}
		else if(year % 100 == 0) {
			System.out.println("Not a leap year");			
		}
		else if(year % 4 == 0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");	
		}
	}
}
