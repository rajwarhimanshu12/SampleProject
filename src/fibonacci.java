
public class fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<8;i++) {
			int num=a+b;
			System.out.println(num);
			a=b;
			b=num;
		}
	}

}
