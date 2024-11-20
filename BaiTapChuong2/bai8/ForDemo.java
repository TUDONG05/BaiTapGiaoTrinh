package bai8;

public class ForDemo {
public static void main(String[] args) {
	int tong =0;
	for(int i =1;i<=100;i++) {
		if(i%2==0) {
			tong+=i;
		}
	}
	System.out.println("tong cac so chan tu 1 den 1000 la: " + tong);
}
}
