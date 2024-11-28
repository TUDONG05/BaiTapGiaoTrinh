package object_file;
import java.io.*;

public class ObjectFile {
	public static void main(String[] args) {
		FileOutputStream fo;
		ObjectOutputStream out;
		try {
			fo =new FileOutputStream("exp.dat");
			out = new ObjectOutputStream(fo);
			
//			khoi tao 2 doi tuong
			Person p1 = new Person(123,"Dong Van Tu","Bac Giang",'M');
			Person p2 = new Person(124,"Lee Brunce","Hong Kong",'M');
			
//			ghi doi tuong vao file
			out.writeObject(p1);
			out.writeObject(p2);
			
			out.close();
			System.out.println("Ghi doi tuong vao file thanh cong");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
//		doc file doi tuong
		FileInputStream fi;
		try {
			fi = new FileInputStream("exp.dat");
			ObjectInputStream in = new ObjectInputStream(fi);
			
			Person s1 =(Person)in.readObject();
			System.out.println("Thong tin nguoi thu 1 la: "+ s1);
			
			Person s2 =(Person)in.readObject();
			System.out.println("Thong tin nguoi thu 2 la: "+s2);
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
}
