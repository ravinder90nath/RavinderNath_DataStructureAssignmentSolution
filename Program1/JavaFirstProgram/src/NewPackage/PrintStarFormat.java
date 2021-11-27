package NewPackage;
import java.util.Scanner;

public class PrintStarFormat {
	public static void main(String[] argh) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter No:");
		int num=sc.nextInt();
		
		for(int i=0; i<num;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
