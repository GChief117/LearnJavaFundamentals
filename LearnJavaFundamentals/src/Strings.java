
public class Strings {
	
	
	public static void main(String[] args) {
		String myName = "Gunnar";
		int length = myName.length();
		System.out.println("My name is " + myName);
		String myNameUpper = myName.toUpperCase();
		
		String phrase = "hello world";
		System.out.println(phrase.indexOf("Power"));//--no instance wo we will have -1
		System.out.println(phrase.indexOf("Hello"));//no instance -1, 0 and 1 for a boolean
		System.out.println(phrase.indexOf("hello")); ///0 means its there
//getting part of the string
		//System.out.println(phrase.substring(16));//out of bounds exception out of the string index
		System.out.println(phrase.substring(11));//this works
		System.out.println(phrase.substring(3, 11));//in between strings, will get lo world

		
		///decalre and memory
		
		///declare adn memeory

	
	
	
	///comparing strings 
	
	 String hiName = "Dale McGovern";
     String yourName = "Dale Smethurst";

     String myFirstName = myName.substring(0,4);
     String yourFirstName = yourName.substring(0,4);
     
     System.out.println(myFirstName);
     System.out.println(yourFirstName);

     //boolean weHaveTheSameFirstName = myFirstName == yourFirstName;
     boolean weHaveTheSameFirstName = myFirstName.equals(yourFirstName); //same as the bottom

     
     //use .equals for strings not == 
     
     //reminder % _X_ (number you want to divide) == 0;
     
     
     System.out.println(weHaveTheSameFirstName);
     
     
     
     String firstDay = "Sunday";
     
     String lastDay;
     
     if (firstDay.equals("Sunday")) {
    	 lastDay = "Sunday";
     }
     else {
    	 lastDay = "Sunday";
     }
     
     String nextDay = firstDay.equals("Sunday") ? "Monday" : "Tuesday"; //we need to see what the next day
     //? means the ternary oeprator
     
     
     
     String newString = "Sandra Burnshide";
     
    
     
     //indexOf is a method to declare after initalizing
     
     int spacePosition = newString.indexOf(" ");
     
     String surname = newString.substring(spacePosition + 1, newString.length());
     
     boolean evenLength = surname.length() % 2 == 0 ? true : false;
     
     System.out.println(surname);
     System.out.println(evenLength);
     
     
     //concationing use the + 
     
     
     System.out.println(myName + " " + surname + " " + evenLength);
     
     
     
     //String greeting = "Good mroniing <<surname>>, today <<nextDay>>";
     //concatinate
     
     
     String greeting = "Good Morning" + surname + " today is " + nextDay;
     
     String greeting2 = String.format("Good morning %s, today is %s", surname, nextDay);
     
     System.out.println(greeting);
     System.out.println(greeting2);
     
     
     //Splitting strings
     
     
     String colors = "blue, red, green, orange, purple"; //convert to array
    		 
     String[] colorsArray = colors.split(", "); //get a sepreate line
     
     for (String color : colorsArray) {
    	 System.out.println(color);
     }
     
     
     //must use .equals
     
     //code structure
    		 

}
}