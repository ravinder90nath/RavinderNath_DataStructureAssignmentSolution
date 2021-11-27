package NewPackage;
import java.util.Scanner;

public class InputOutputOperations {
	public static void main(String[] argh) {
		
		int num = 1;
		
		int num1;
		float num2;
		char character;
		boolean bool;
		String str;
		double num3;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Int value:");
		num1 = sc.nextInt();
		
		System.out.println("Enter Float Value:");
		num2 = sc.nextFloat();
		
		System.out.println("Enter String value:");
		str = sc.next();
		
		System.out.println("Enter Double value:");
		num3 = sc.nextDouble();
		
		System.out.println("Enter Boolean value:");
		bool = sc.nextBoolean();
		
		System.out.println("Enter Character Value:");
		character = sc.next().charAt(0);
		
		
		System.out.println();

		System.out.println("Int value:" + num1);
		System.out.println("Float Value:" + num2);
		System.out.println("Character Value:" + character);
		System.out.println("Boolean value:" + bool);
		System.out.println("String value:" + str);
		System.out.println("Double value:" + num3);
		
	}
}
