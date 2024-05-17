package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		//実装1
		int x = 5;
		int y = 10;
		int z = x + y;

		System.out.println("変数zの値は" + z + "です");
		//実装2
		double a = 5.25;
		a = a + 2.5;
		a = a * 3.0;
		int b = (int) a;
		b = b + 10;
		System.out.println(a);
		System.out.println(b);
	}
}
