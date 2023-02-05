package filteringObjects;

public class Book {
	private String name;
	private int stock;
	
	public Book(String name, int stock) {
		super();
		this.name = name;
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", stock=" + stock + "]";
	}

	public String getName() {
		return name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
