package bai4;

import java.util.Scanner;

import bai3.StringTooLongexception;

public class Test {
	public static void main(String[] args) throws StringTooLongexception {

		Scanner input = new Scanner(System.in);
		
			System.out.println("Nhap cac chuoi, neu gap chuoi DONE thi ket thuc chuong trinh");
			while (true) {
				try {
				System.out.println("Nhap chuoi: ");
				String a = input.nextLine();
				if (a.equalsIgnoreCase("DONE")) {
					System.out.println("Ket thuc chuong trinh!");
					break;
				}
				if (a.length() > 20) {
					throw new StringTooLongexception("Loi nhap qua ki tu!");
					
				}
				}
				catch (StringTooLongexception e) {
					System.out.println(e.getMessage());
				}
			}
		

	}
}
