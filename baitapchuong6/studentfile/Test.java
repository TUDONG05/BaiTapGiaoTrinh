package studentfile;
import java.io.*;
public class Test {
	public static void main(String[] args) {
//	tao 2 doi tuong
		Student s1 = new Student("01","Dong Van Tu","01/03/2005",'M');
		Student s2 = new Student("02","Dong Tuan Anh","16/09/1998",'M');
		

		try {
//			ghi 2 doi tuong vao file
			FileOutputStream fo= new FileOutputStream("student.dat");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			
			out.writeObject(s1);
			out.writeObject(s2);
			out.close();
			System.out.println("GHi 2 doi tuong vao file thanh cong!");
			
			
//			doc 2 doi tuong tu file len console
			
			FileInputStream fi = new FileInputStream("student.dat");
			ObjectInputStream in = new ObjectInputStream(fi);
			try {
				Student p1 =(Student)in.readObject();
			System.out.println("Thong tin hoc sinh thu nhat: "+p1);
			Student p2 =(Student)in.readObject();
			System.out.println("Thong tin hoc sinh thu hai:" + p2);
			
			}
			catch(ClassNotFoundException c) {
				System.out.println("Khong tim thay lop Student: " + c.getMessage());
			}
			
		}
		catch(IOException e) {
			System.out.println("Loi:" + e.getMessage());
		}

		

}
}
