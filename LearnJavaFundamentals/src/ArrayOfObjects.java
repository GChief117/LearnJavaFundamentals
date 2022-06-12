
public class ArrayOfObjects {
	
	public static void main(String[] args) {		
        int[] numbers = {1,2,3};

        Book[] books = new Book[10]; //array of 10  ///how we declare a name of an array

        books[4] = new Book("A good read", "Matt Greencroft", 17.99);

        Book myBook;
        myBook = new Book("A good read part 2", "Matt Greencroft", 37.99);
        //myBook = null;

        if (myBook != null) {
            System.out.println(myBook.getTitle());
        }

        books[5] = myBook;
		
        //adding books
        books[8] = new Book("Of mice and men", "Johnny bravo", 18.95);
        books[9] = new Book("Pride and projudging", "Judge judy", 19.99);
        
        
        
        //loopoing throgh array, printing out the books
        //10 represents the array
        
        for (int i = 0; i < 10; i++) {
        	if (books[i] != null)  //when we do an if statement, if that if statement is true you dont need to {} 
        	System.out.println(books[i].getTitle());
        	

        }
        
      //data type = book; // books == the array we weant to be searching for
        for (Book book : books) {
        	if (book != null)
        		System.out.println(book.getTitle());
        	
        }
	}
	
	
	/**
	 * 	int[] numbers= {1,2,3};
		
		
		
		//we are a book shop
		
		
		//messy Book[] books = {new Book(), new Book()};
		
		Book[] book = new Book[10];
		
		
		//set and asign position in arrays
		
		book[4] = new Book("A good read", "Matt Greencoff", 18.55); //instantiate arary
		
		//setting variable to null--not referenced by an object
		
		
		Book myBook; 
		
		myBook = new Book("ahhah", "Matt Greencoff", 28.55);
		
		//myBook = null; //my book no longer has a value, only works with variables
		//has a class data type and 
		
		//primateves cannot be null

		//int myAge = null; 
		
		//to solve with null
		
		
		if(myBook != null) {
		System.out.println(myBook.getTitle());
		}
		
		
		book[5] = myBook; //this is how we decalre an array

		
		System.out.println(myBook.getTitle());//yep we get null point exception because there is no book to get title
		//that is when myBook = null;
		//to solve with null
		
		//For any null or array use == because you are treating everything as integers or doubles
		
		
	 */

}
