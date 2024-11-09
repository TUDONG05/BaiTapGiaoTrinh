package parttime_employee;
import java.util.Scanner;
public class Person {
	// dinh nghia cac thuoc tinh
	protected String name;
	protected int age;
	protected char gender;
	
	//constructor
	public Person() {
		
	}
	
	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender=gender;
	}

	//setter()
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender=gender;
	}
	
	//getter()
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	
	//phuong thuc nhap vao thong tin
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập tên:");
		this.name=input.next();
		
		System.out.println("Nhập tuổi:");
		this.age=input.nextInt();
		
		System.out.println("Nhập giới tính: ");
		this.gender=input.next().charAt(0);
		
	}
	@Override
	public String toString() {
		String i = "Name: " + this.name
				+ ", age: " + this.age
				+ ", gender: " +this.gender;
		return i;
	}
	

	
	
	
}
