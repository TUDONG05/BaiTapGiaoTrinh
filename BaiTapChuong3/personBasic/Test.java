package personBasic;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		//kiem tra setter()
		p1.setName("Tu");
		p1.setDob("01/03/2005");
		p1.setPob("BG");
		p1.setGender('M');
		p1.setEmail("abc@gmail.com");
		p1.setPhone("0123456789");
		
		//kiem tra cac setter()
		System.out.println("name:" + p1.getName());
		System.out.println("day of birth: " + p1.getDob());
		System.out.println("place of birth: " + p1.getPob());
		System.out.println("gender: " + p1.getGender());
		System.out.println("email: "+ p1.getEmail());
		System.out.println("phone: " + p1.getPhone());
		
		//kiem tra toString()
		System.out.println(p1.toString());
	}

}
