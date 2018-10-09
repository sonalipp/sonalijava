package deloittecore;

public class mthd {
	public static void main(String[] args) {
		int a = 20,b = 30;
		int c = max(a,b);
		System.out.println(c);
	}
	public static int max(int x,int y) {
		if(x > y) {
			return x;
		}else {
			return y;
		}
	}
}

