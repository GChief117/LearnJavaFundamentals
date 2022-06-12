
public class NameManager {
	
	
	//three types of methods names
	
	///String, integers, and booleans 
	
	
	///create a class level string variable containing your full name
	
	//create 2 methods in this class, which will take no parementers
	//return string, getFirstname and getSurname
	
	//In each meothod return the correct part of the name by using the String's split funciton
	
	
	private String myName = "Gunnar Nelson";
	
	
	public String getFirstName(){
		
		String[] values = myName.split(" ");
		
		return values[0];
	}
	
	
	//if we change one of the wors to priveate its private to the class
	public String getSurname(){
		
		String[] values = myName.split(" "); //you need to put in what you want to split for String[] name = variable.split()
		doSomething();
		return values[values.length -1];
	}
	
	//INstaniate we need an instnce of a main manager
	
	
	//creating a static
	
	
	public static void doSomething() {
		System.out.println("Do something");
	}
	

}
