import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ManipulatingCollections {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> firstList = new ArrayList<>();
		firstList.add("one");
		firstList.add("two");
		firstList.add("three");
		firstList.add("four");
		firstList.add("five");
		
		
		
		for(String s: firstList) {
			System.out.println(s); //get 12345 in order
			
		}
		
		Collections.sort(firstList);

		
		
		for(String s: firstList) {
			System.out.println(s); //get 54321 in order
			
		}
		
		
		
		List<Book> books = new ArrayList<>();
		books.add(new Book("First Book", "Matt GreenCfroft", 15.99));
		books.add(new Book("Second Book", "GreenCfroft Matt", 16.99));
		books.add(new Book("Third Book", "Dave mackey", 17.99));
		
		
		Collections.sort(books); //THE BOOK OBJECT NEEDS TO BE a sort of an object
		for (Book b: books) {
			System.out.println(b);
		}
		//how do we sort of a book 
		//java sorts strings in alphabetical order
		
		//we need to tell java what is the natural sort order for our class
		
		//define the sort order
		
		//our class must implment 
		//making a map, maps ahve keys and values
		Map<Integer, Book> bookMap = new HashMap<>(); //we are waiting to put objects into teh colleciton
		//lists use add
		//maps use the put method
		bookMap.put(17, new Book("First Book", "Matt GreenCfroft", 15.99));
		bookMap.put(3, new Book("Second Book", "GreenCfroft Matt", 16.99));
		bookMap.put(21, new Book("Third Book", "Dave mackey", 17.99));//key and value must go in
		bookMap.put(3, new Book("More Book", "Derick Cheater", 16.99));

		
	
		
		//must loop 
		//can get key of the map
		//out oclleciton has three objetcts in it
		
		System.out.println(bookMap.size());
		Book foundBook = bookMap.get(3);
		System.out.println(foundBook);///should get the second book
		
		//sets dont contain duplicates
		
		Set<Integer> keys = bookMap.keySet();
		for (Integer k: keys) {
			System.out.println(bookMap.get(k));
		}
		
		
		var values = bookMap.values();//putting out a collection of books
		//var stores the keyword
		
		for(Book b : values) {
			System.out.println(b);
		}
		
		
		List<Book> bookList = new ArrayList(bookMap.values());
		Collections.sort(bookList);;
		
		Map<Integer, String> myMap = Map.of(1, "one", 2, "two");
		
		
		bookMap.remove(3);
	}



}
