package basicSyntax;

public class ForWhile {
	public static void main(String[] args) {
		//実装内容1
		for (int num = 1; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}
		}
		// 実装内容2
		String[] codenames = { "Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript" };
		for (String codename : codenames) {
			if (codename.equals("Java")) {
				System.out.println("現在学習中の言語は" + codename + "です。");
			} else if (codename.equals("HTML")) {
				System.out.println(codename + "はプログラミング言語ではありません。");
				break;
			} else {
				System.out.println(codename);//その他の言語
			}
		}
	}
}
