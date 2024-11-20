package bai1;

public class bai1 {
	public static void main(String[] args) {
		
//		a)
		int i =5;
		int j =6;
		int x;
		x = i++ + ++j;
		System.out.println(x);
		
//		b)
		int i =10;
		int j=11;
		int x;
		x = --i + j--;
		System.out.println(x);
		
//		c)
		int i=5;
		int j=2;
		int x=i%j;
		System.out.println(x);
		float y = i/j;
		System.out.println(y);
//		
//		d)
		int i =5;
		int j =2;
		float x = (float) i/j;
		System.out.println(x);
		
		
//		e)
		float x = i/(float)j;
		System.out.println(x);
//		f)
		float x =(float)i/(float)j;
		System.out.println(x);
		 
	}
	
	
}
