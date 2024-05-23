package objectExercise;

public class Land extends Property {
	private double size;

	public Land(String name, String owner, String type, long price, double size) {
		super(name, owner, type, price);
		this.size = size;
	}

	//ゲッターの実装
	public double getSize() {
		return this.size;
	}

	//セッターの実装
	public void setlayout(double size) {
		this.size = size;
	}

	public void printLandDetails() {
		System.out.println("=============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwner());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格：" + getPrice() + "円");
		System.out.println("広さ：" + size + "㎡");
		System.out.println("=============================");
	}
}