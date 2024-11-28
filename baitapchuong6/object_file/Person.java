package object_file;
import java.io.Serializable;
public class Person implements Serializable{
	private int id;
	private String name;
	private String address;
	private char gender;
	
//	constructor
	
	public Person() {
		
	}

public Person(int id, String name, String address, char gender) {
	this.id = id;
	this.name = name;
	this.address = address;
	this.gender = gender;
}

@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + "]";
}



}
