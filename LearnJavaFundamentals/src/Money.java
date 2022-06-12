import java.math.BigDecimal;

public class Money {

	public static void main(String[] args) {
		
		
		///Precision doubles than maths
		
		//Big decimale
		
		Double d = 1d;
		for (int i = 0; i < 10; i++) {
			d += 0.1;
			System.out.println(d); //each double is stored in memory, and we only get 10 doubles //can do maths withdoubles	
			
		}
		
		BigDecimal total = new BigDecimal("1");///Use a string for value
		for (int i = 0; i < 10; i++) {
			//take existign decimal
			
			total = total.add( new BigDecimal ("0.1"));
			System.out.println(total);///we get rid of the 00000s fromt eh doubles

			
		}
		//Can do 
		
		BigDecimal one = BigDecimal.ONE; //you cant do maths quite as easily and notice they add a new vlaue eveyr time
		
		//can do something equal to it
		//must capture outlet ot he methdos
		
		///but it doesn need level of rpecision needed
		
		//accuracy is important
		
		///bring the unit to the close
		
		
		
	}

}
