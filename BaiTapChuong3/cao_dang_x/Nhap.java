package cao_dang_x;

public class Nhap {
protected int n;
public Nhap() {
	
}
public Nhap(int n) throws InputException {
	if(n<2 || n>5)
		throw new InputException("loi nhap n!");
		else
			this.n=n;
}
}
