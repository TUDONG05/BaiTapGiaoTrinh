package bai3;
import java.util.Scanner;
public class Test {
public static void main(String[] args) throws StringTooLongexception {
	String ch[]= new String[100];
	
	Scanner input = new Scanner(System.in);
	System.out.println("Moi nhap cac chuoi ki tu!!");
	String d ="DONE";
	
	
	try {
		for(int i=0;i<ch.length;i++) {
		
		ch[i] = input.nextLine();
		if(ch[i].equals(d))
			break;
	}	
		try {
			for(int i=0;i<ch.length;i++)
	if(ch[i].length()>30) throw new StringTooLongexception("vuot qua so ki tu quy dinh!!");
		}
		catch( NullPointerException l) {
			System.out.println(l.getMessage());
		}
	
	}
	catch (StringTooLongexception e) {
		System.out.println("Loi: " +e.getMessage());
	}
	
	
	

		
		
}
}
