
public class InterchangeTwoNumbers {
	public static void main(String[] argh) {
		int num1 = 12;
		int num2 = 15;

		System.out.println("initial value");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" +num2);

		System.out.println();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After interchange value");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" +num2);
	}
}
