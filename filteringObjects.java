package filteringObjects;
import java.util.*;
import java.util.function.Consumer;

public class filteringObjects {

	public static void main(String[] args) {
		List<Book> library = new ArrayList<>();
		library.add(new Book("Jane Eyre", 5, 100));
		library.add(new Book("Harry Potter", 10, 200));
		library.add(new Book("Robin Hood", 2, 150));
		
		// using lambda
		List<Book> popularBooks = filter(library, (Book b) -> b.getStock() >= 5);
		
		// using method reference		
		popularBooks = filter(library, Book::overstock);
		
		// sorting using lambdas
		library.sort((Book b1, Book b2) -> b1.getIndex().compareTo(b2.getIndex()));
		sort(library, (Book b1, Book b2) -> b1.getStock() > b2.getStock() ? 0 : 1);
		
		// using consumer and method reference to print the books
		Consumer<Book> c = System.out::println;
		for(Book b:library) c.accept(b);
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
	
	public static <T> List<T> sort(List<T> list, Comparator<T> p) {
		boolean sorted;
		do {
			sorted = true;
			for(int i = 1; i < list.size(); i++) {
				if(p.compare(list.get(i), list.get(i - 1)) == 1) {
					T temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					sorted = false;
				}
			}
		}while(!sorted);
		return list;
	}

}
