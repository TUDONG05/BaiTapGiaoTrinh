package bai6;
import java.util.Scanner;
public class PhepTinhCoBan {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("a=");
	int a = input.nextInt();
	
	System.out.println("b=");
	int b = input.nextInt();
	
	System.out.println("a + b = "+ (a+b));
	System.out.println("a - b = "+ (a-b));
	System.out.println("a * b = "+ (a*b));
	System.out.println("a / b = "+ (a/b));
}
}
