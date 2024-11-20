package bai9;

public class TongLe {
public static void main(String[] args) {
	int tong =0;
	for(int i =1;i<=100;i=i+2) {
			tong+=i;
			System.out.println(i);
	}
	System.out.println("tong cac so le tu 1 den 1000 la: " + tong);
}
}

