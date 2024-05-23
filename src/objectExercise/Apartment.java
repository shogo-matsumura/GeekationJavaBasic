package objectExercise;

public class Apartment extends Property {
	private String layout;

	public Apartment(String name, String owner, String type, long price, String layout) {
		super(name, owner, type, price);
		this.layout = layout;
	}

	//ゲッターの実装
	public String getLayout() {
		return this.layout;
	}

	//セッターの実装
	public void setlayout(String layout) {
		this.layout = layout;
	}

	public void printApartmentDetails() {
		System.out.println("=============================");
		System.out.println("物件名：" + getName());
		System.out.println("物件所有者名：" + getOwner());
		System.out.println("物件種別：" + getType());
		System.out.println("物件価格：" + getPrice() + "円");
		System.out.println("間取り：" + layout);
		System.out.println("=============================");
	}
}