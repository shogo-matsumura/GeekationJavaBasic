package basicSyntax;

public class IfSwitch {
	public static void main(String[] args) {
		//実装内容1
		int num = 6;
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2の倍数です。");
		} else if (num % 2 == 0) {
			System.out.println("2の倍数です。");
		}
		//実装内容2
		else if (num % 3 == 0) {
			System.out.println("3の倍数です。");
		//実装内容3
		} else {
			System.out.println("どちらでもありません。");
		}
		//実装内容4 
		String pref = "東京";
		switch (pref) {
		case "北海":
			System.out.println("北海道");
			break;
		case "東京":
			System.out.println("東京都");
			break;
		case "京都":
			System.out.println("京都府");
			break;
		default:
			System.out.println("当てはまりません。");
			break;
		}
	}
}
