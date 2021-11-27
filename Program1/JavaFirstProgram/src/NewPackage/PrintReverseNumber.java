package NewPackage;

import java.util.Scanner;

public class PrintReverseNumber {
	public static void main(String[] argh) {
		
		int num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number");
		num = sc.nextInt();
		System.out.println();
		while(num > 0) {
			System.out.print(num + " ");
			num--;
		}
	}
}
