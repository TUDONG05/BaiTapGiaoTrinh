package nhiphan;

import java.io.*;
import java.util.Scanner;

public class NhiPhan {
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
//	nhap chuoi ki tu
			System.out.println("Nhap mot chuoi ki tu:");
			String s = input.nextLine();
//		nhap 1 so nguyen
			System.out.println("Nhap mot so nguyen:");
			int n = input.nextInt();
//		nhap mot so thuc
			System.out.println("Nhap mot so thuc:");
			double f = input.nextDouble();

			try {
				FileOutputStream fo = new FileOutputStream("exp.dat");
				DataOutputStream out = new DataOutputStream(fo);

				out.writeUTF(s);
				out.writeInt(n);
				out.writeDouble(f);

				out.close();

				System.out.println("Tao file thanh cong!");

			}

			catch (IOException e) {
				System.out.println("Co loi khi tao file nhi phan: " + e.getMessage());
			} finally {
				input.close();
			}
		} catch (Exception z) {
			System.out.println(z.getMessage());
		}
		
//		doc file
		File check = new File("exp.dat");
		if(check.exists()) {
			System.out.println("File exp.dat ton tai");
			try {
				FileInputStream fi = new FileInputStream("exp.dat");
			DataInputStream in = new DataInputStream(fi);
			
			String is = in.readUTF();
			System.out.println("Chuoi vua ghi la: " + is);
			
			int ii =in.readInt();
			System.out.println("So nguyen vua nhap la: " +ii);
			
			double id = in.readDouble();
			System.out.println("So thuc vua nhap la:" + id);
			in.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
		}

	}
}
