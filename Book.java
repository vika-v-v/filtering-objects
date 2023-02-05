package filteringObjects;

public class Book {
	private String name;
	private int stock;
	private Integer index;
	
	public Book(String name, int stock, Integer index) {
		super();
		this.name = name;
		this.stock = stock;
		this.index = index;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", stock=" + stock + ", index=" + index + "]";
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
	public Integer getIndex() {
		return index;
	}
	
	
}
