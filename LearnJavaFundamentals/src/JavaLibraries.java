import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class JavaLibraries {

	public static void main(String[] args) {
		Date today = new Date(); //new date and time when it was instantiated

		//Helperclass
		
		//Current time we set in place 
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(today);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) -1);
		System.out.println(calendar.getTime());////using the get Time from the calendar object we created which is Jun 9th 8:23 because
		
		
		GregorianCalendar birthday = new GregorianCalendar(1936,3,16); //the gregorian calendar is treated as an array and January is set to 0
		Date birthdayDate = birthday.getTime(); //object of type date April 16th, no time specified, at 1936
		
		
		
		System.out.println(today); ///going to print out today's specific date June 10th 8:23:08 2022
		System.out.println(birthdayDate); //going to print out April 16th, 0:000 at 1936
		System.out.println(birthday); ///prints out the Gregorian Calendar birthday in al fields
		
		
		//SimpleDate
		SimpleDateFormat sdq = new SimpleDateFormat("MM-dd-yyyy");
		String prettyDate = sdq.format(birthdayDate);
		System.out.println(prettyDate); //print out the birthdate April 16th, 1936 as 04-16-1936

		LocalDateTime theDateAndTime = LocalDateTime.now();
		LocalDateTime anotherDateAndTime = LocalDateTime.of(2022, 11, 16, 17, 15); //year, moth, day, hour, minute
		LocalDate someDate = LocalDate.of(2022, 11, 16);
		LocalTime someTime = LocalTime.from(anotherDateAndTime);
		
		///Yesterday taking the LocalDate and subtracting 1 day
		
        LocalDate yesterday = LocalDate.now().minusDays(1);
        LocalDate myBirthday = LocalDate.of(1986,12,12); //local date not treated like array 
        Period difference = Period.between(myBirthday, yesterday);
        System.out.println("There are " + difference.getYears() + " years and " +
                difference.getMonths() + " months, and " + difference.getDays() +" days between the two dates") ;		
		
		
		
		System.out.println(theDateAndTime.format(DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm"))); ///got the specific date and time of right now
		System.out.println(someTime); //some time made from anotherDateAndTime

		
		
	}

}
