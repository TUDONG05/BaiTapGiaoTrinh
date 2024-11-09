package shape;
import java.util.Scanner;
public class Triangle extends Shape{
	protected int base;
	protected int height;
	
	
	public Triangle() {
		
	}
	
	public Triangle(String color, int base, int height) {
		super(color);
		this.base =base;
		this.height=height;
	}
	@Override 
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhập chiều cao: ");
		this.height=input.nextInt();
		
		System.out.println("Nhập cạnh đáy: ");
		this.base=input.nextInt();
		
	}
	@Override
	public double getArea() {
		return  0.5 * this.base * this.height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height  + ", " + super.toString()
				+ "]";
	}
	
	
	
	
}
