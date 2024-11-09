package parttime_employee;
import java.util.Scanner;
public class PartTimeEmployee extends Employee{
	protected int hoursPerWeek;
	
	public PartTimeEmployee() {
		
	}
	
	public PartTimeEmployee(String name,int age,char gender,String employerName,String dateHired,int hoursPerWeek) {
	super(name,age,gender,employerName,dateHired);
	this.hoursPerWeek=hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	
	@Override
	public void nhapTT() {
		Scanner input =new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhập số giờ làm mỗi tuần:");
		this.hoursPerWeek=input.nextInt();
		}
	@Override
	public String toString() {
		 String i = super.toString()
				 + ", hourPerWeek: " + this.hoursPerWeek;
		 return i;
	}
	
	
}
