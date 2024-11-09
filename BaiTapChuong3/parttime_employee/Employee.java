package parttime_employee;
import java.util.Scanner;
public class Employee extends Person{

	//dinh nghia cac thuoc tinh
	
	protected String employerName;//tên của người tuyển dụng nhân viên này vào làm việcviệc
	protected String dateHired;//ngày nhân viên này được nhân vào làm việc
	
	
	
	//contructor
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, char gender, String employerName, String dateHired) {
		super(name,age,gender);
		this.employerName = employerName;
		this.dateHired = dateHired;
	}

	//setter()
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	//getter
	public String getEmployerName() {
		return employerName;
	}

	public String getDateHired() {
		return dateHired;
	}

	
	@Override
	public void nhapTT() {
		Scanner input =new Scanner(System.in);
		super.nhapTT();
		System.out.println("Nhập tên người đã tuyển nv này vào làm: ");
		this.employerName=input.next();
		
		System.out.println("Nhập ngày đươc nhận vào làm: ");
		this.dateHired=input.next();
	
	}

	@Override
	public String toString() {
		String i = super.toString()
			+ ", employerName:  " +this.employerName
			+ ", dateHired: " + this.dateHired;
		return i;
	}
	
	
	
	
	
}
