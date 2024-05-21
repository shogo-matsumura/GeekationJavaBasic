package basicSyntax;

public class MethodPractice {
	public static void main(String[] args) {
		//実装内容
		int a = 10;
		int b = 2;

		int result1 = subMathOne(a, b);
		int result2 = subMathTwo(a, b);
		int result3 = subMathThree(a, b);
		int result4 = subMathFour(a, b);

		subMathFive(result1, result2, result3, result4);
	}

	public static int subMathOne(int a, int b) {
		int c = a + b;
		return c;
	}

	public static int subMathTwo(int a, int b) {
		int d = a - b;
		return d;
	}

	public static int subMathThree(int a, int b) {
		int e = a * b;
		return e;
	}

	public static int subMathFour(int a, int b) {
		int f = a / b;
		return f;
	}

	public static void subMathFive(int result1, int result2, int result3, int result4) {
		System.out.println("計算結果は" + result1 + "です。");
		System.out.println("計算結果は" + result2 + "です。");
		System.out.println("計算結果は" + result3 + "です。");
		System.out.println("計算結果は" + result4 + "です。");
	}
}
