package objectExercise;

public class Property {
	private String name;
	private String owner;
	private String type;
	private long price;

	Property(String name, String owner, String type, long price) {

		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}

	//ゲッター
	public String getName() {
		return name;
	}

	public String getOwner() {
		return this.owner;
	}

	public String getType() {
		return this.type;
	}

	public long getPrice() {
		return this.price;
	}

	//セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}