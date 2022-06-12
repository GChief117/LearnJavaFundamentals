import java.time.LocalDate;

public class Exceptions {
	
	
	
	public static void dividingByZero() {
		System.out.println(17 / 0);
		
		
	}
	
	
	public static void dividing(int denominator) {
		System.out.println(17 / denominator); //know the error occured at line 14
		
	}
	
	
	
	public static void main(String[] args) {
		//Integer[] integerArray = new Integer[] {1,2,3,4};
		//Integer[] integerArray = new Integer[] {1,2,3,4,5};
		//System.out.println(integerArray[5]);
		//dividing(4);//
		//dividing(0);//main is where the error occurs
		//dividingByZero();//when printing put them inside it 
		
		
		//LocalDate today = null; //null point exception //we only find out about them by testing 
				
		//if (today != null) //null safety check 
		//	System.out.println(today.getMonth());
		
		
		
		//String hello = "123";
		//Double value = Double.valueOf(hello);
		
		
		
		
		
		try {
			User user1 = new User("Matt", -3);
			User user2 = new User("Sally", 3);
		} catch (InvalidAgeException e) { //e represents the invalid exception 
			e.printStackTrace();///try and catch allows applciaton to run and allow those exceptions can occur and have the total applicaiton crash occuring
		}
		

		
		
	}
	

}
