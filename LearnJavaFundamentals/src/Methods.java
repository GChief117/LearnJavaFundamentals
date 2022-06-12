
public class Methods {
	
	
	static String myName = "Gunnar";
	
	public static void main(String[] args) {
		
		for(String arg: args) {
			System.out.println(arg);
		}
		
		//we can see how the command line arguements to help with method signature and apraemeters
		//each line which will define the method
		
		int result = addTwoNumbers(7,16);//will get 23
		System.out.println("The result was "+ result);
		
	
		double total = addThreeNumbers(2.2,1.5,8.8);
		
		
		
		
		//name manager is an obejct and the class is the definition and this is the object which is an example of the class
		NameManager nameManager = new NameManager(); //a class is a bluprint and need an isntnace of the class
		NameManager nameManager2 = new NameManager();  //two objects
		
		
		
		System.out.println(nameManager.getFirstName());
		System.out.println(nameManager.getSurname());
		
		
		NameManager.doSomething();
		nameManager.doSomething(); //both are correct
		
	}
	
	
	public static int addTwoNumbers(int number1, int number2) {
		System.out.println( number1+ number2);
		printMyName();
		return number1 + number2;
		
		/**if (number1 == 0) {
			return -1;
		}
		**/  //unreachable because we arelady have return
		
		
		}
	
	
	public static void printMyName() {
		System.out.println("My name is Matt");
	}
	
	
	//a method can return a value 
	
	//return weather its an int or the public where it will be the public after it
	
	
	public static int wholsSolder(int integer1, int integer2) {
		
		if (integer1 > integer2) {
			return integer1;
		} else {
			return integer2;
		}
		
	}
	
	public static boolean longerThan5(String power) { //boolean is another emthod
		
		
		return power.length()  >= 6;  ///Return the power length
		
	}
	
	
	
	public static double addThreeNumbers(double value1, double value2, double value3) {
		double result = value1 + value2 + value3;
		System.out.println(myName);
		return result; 
		
	}
		
		
		
		
	}
	
	
	

