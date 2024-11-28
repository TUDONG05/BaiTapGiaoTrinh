package bai1;
import java.io.*;
import java.util.Scanner;
public class TextFile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		nhap 1 chuoi
		System.out.println("Nhap mot chuoi ky tu:");
		String s=input.nextLine();
		
//		nhap 1 so nguyen
		System.out.println("Nhap mot so nguyen:");
		int n = input.nextInt();
		
//		nhap 1 so thuc
		System.out.println("Nhap mot so thuc:");
		double b= input.nextDouble();
		
		
		try {
		FileWriter fw =new FileWriter("exp.txt");
		PrintWriter out = new PrintWriter(fw);
		
		out.println(s);
		out.println(n);
		out.println(b);
		out.close();
		System.out.println("Tao file thanh cong!!");
		
		}
		
		catch (IOException e) {
			System.out.println("Co loi khi tao file: " + e.getMessage());
		
		}
		
		//doc file
		try {
			File exp= new File("exp.txt");
		FileReader fi = new FileReader("exp.txt");
		BufferedReader in = new BufferedReader(fi);
		if(exp.exists()) {
			System.out.println("File nay ton tai!");
			
			String x = in.readLine();
			System.out.println("Chuoi da ghi vao file la:" +x);
			
			String nguyen =in.readLine();
			int sn =Integer.parseInt(nguyen);
			System.out.println("So nguyen da ghi vao file la: " + sn);
			
			String thuc =in.readLine();
			double st =Double.parseDouble(thuc);
			System.out.println("so thuc da ghi vao file la: "+st);
			
			in.close();
			
			}
		else 
			System.out.println("File khong ton tai!");
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
	
		
		
	}
}
