package mosina;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTime {
	public static void main(String[] args) {
	LocalDate currentdate=LocalDate.now();
	System.out.println("current date : "+currentdate);
	
	LocalTime currenttime=LocalTime.now();
	System.out.println("current time : "+currenttime);
	
	LocalDateTime currentdatetime=LocalDateTime.now();
	System.out.println("current date time : "+currentdatetime);
	
	LocalDate nextweek=currentdate.plusWeeks(2);
	LocalDate lastmonth=currentdate.minusMonths(1);
	System.out.println("Date after 1 week: "+nextweek);
	System.out.println("Date one month ago: "+lastmonth);
	
	LocalDate birthdate=LocalDate.of(2003,10,11);
	System.out.println("My Birthday :"+birthdate);
	
	Period age=Period.between(birthdate, currentdate);
	System.out.println("age :"+age.getYears()+"years : "+age.getMonths()+" months");
	
	long daysBetween = ChronoUnit.DAYS.between(birthdate, currentdate);
	System.out.println("Days since birth: "+daysBetween);

}
}
