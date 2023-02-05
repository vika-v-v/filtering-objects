package filteringObjects;
import java.util.*;

public class filteringObjects {

	public static void main(String[] args) {
		List<Book> library = new ArrayList<>();
		library.add(new Book("Jane Eyre", 5));
		library.add(new Book("Harry Potter", 10));
		library.add(new Book("Robin Hood", 2));
		
		List<Book> popularBooks = filter(library, (Book b) -> b.getStock() >= 5);
		
		for(Book b:popularBooks) System.out.println(b);
	}
	
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> result = new ArrayList<T>();
		for(T item:list) {
			if(p.test(item)) {
				result.add(item);
			}
		}
		return result;
	}

}
