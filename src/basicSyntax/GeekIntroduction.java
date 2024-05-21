package basicSyntax;

public class GeekIntroduction {
//実装内容1
	public static void greeting(String type) {
		String message = "";
		int age = 33;
		double height = 180;

		switch (type) {
		case "one":
			message = "こんにちは! 私はGeek君でごわす。";
			break;
		case "two":
			message = "年は" + age + "でごわす。";
			break;
		case "three":
			message = "年は" + height + "でごわす。";
			break;
		}
		System.out.println(message);
	}
//実装内容2
	public static void specialSkill(int num1, int num2) {
//num1からnumw2の範囲で繰り返される処理
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;
		}
		if (num1 >= num2) {
			System.out.println("num2はnum1より大きい値にしてください。");
			return;
		}
		if (num1 > 300 || num2 > 300) {
			System.out.println("num1とnum2は300以下にしてください。");
			return;
		}
// num1からnum2の範囲内で繰り返し処理
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + "は3の倍数かつ5の倍数です。");
				continue;
			} else if (i % 3 == 0) {
				System.out.println(i + "は3の倍数です。");
				continue;
			} else if (i % 5 == 0) {
				System.out.println(i + "は5の倍数です。");
				continue;
			}
		}
	}
}
