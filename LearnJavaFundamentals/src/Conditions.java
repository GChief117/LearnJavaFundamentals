
public class Conditions {
	
	
	public static void main(String[] args) {
	
	int testScore = 100;
	
	if (testScore <= 50) { //always initialize in the top
		System.out.println("tada");
	}
	else if  (testScore == 50) {
		System.out.println("loser");
	} 
	else { ///if >50
		System.out.println("haha");
	}
	
	//switch
	switch(testScore) {
	case 0:
		System.out.println("Sorry no test taken :(");
		System.out.println("0");
		break;
	case 100:
		System.out.println("WOOOWOOO");
		break;
	case -1:
		System.out.println("How the fuck did you manage to get that?!");

	}
	
	
	//if score >50 and score is divisible by 10
	
	if (testScore > 50 && testScore % 10 == 0) {
		System.out.println("You passed with a score ending in zero");
		
	}

}
}
