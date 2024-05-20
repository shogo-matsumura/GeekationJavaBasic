package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//実装内容1
		int a = 5;
		int b = 10;
		//実装内容2
		boolean isGreater = (a < b);
		boolean isSunny;
		boolean isworm;
		isSunny = true;
		isworm = true;
		boolean isGoodWeather = isSunny && isworm;

		//実装内容3
		int x = 5;
		int y = 10;
		boolean isEven = (y % 2 == 0);
		boolean isGoodNumber = (x >= 0 && isEven);

		System.out.println(isGreater);
		System.out.println(isGoodWeather);
		System.out.println(isGoodNumber);

		//実装内容4
		boolean hasPermission = false;
		if (!hasPermission) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
