package shape;
import java.util.Scanner;
public abstract class Shape {
	protected String color;
	public Shape() {
		
	}
	public Shape(String color) {
		this.color=color;
	}
	public abstract double getArea();
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập màu: ");
		this.color=input.next();
	}
	@Override
	public String toString() {
		return "color=" + color + ", area=" + getArea();
	}
	
	

}
