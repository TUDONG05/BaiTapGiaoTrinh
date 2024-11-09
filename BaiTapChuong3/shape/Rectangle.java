package shape;
import java.util.Scanner;
public class Rectangle extends Shape {
	protected int length;
	protected int width;
	
	public Rectangle() {
		
	}
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	
	@Override 
	public void nhapTT() {
		
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		
		System.out.println("Nhập chiều dài: ");
		this.length= input.nextInt();
		
		System.out.println("Nhập chiều rộng: ");
		this.width=input.nextInt();
	}
	
	@Override
	public double getArea() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return  "Rectangle [length=" + length + ", width=" + width + ", " + super.toString()+  "]";
	}
	
	

	
}
