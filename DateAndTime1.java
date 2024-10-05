package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateAndTime1 {

	public static void main(String[] args) {
		// LocalDate
		
		LocalDate now = LocalDate.now();
		LocalDate custom = LocalDate.of(2003,12,26);
		System.out.println(now);
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getYear());
		System.out.println(now.getMonth());
		System.out.println(custom.getDayOfMonth());
		
		//LocalTime
		LocalTime now1 = LocalTime.now();	
		System.out.println(now1);
		
		//Local Date TIME
		LocalDateTime now2  = LocalDateTime.now() ;
		System.out.println(now2);
		
		//ZonedDateTime
		ZonedDateTime now3 = ZonedDateTime.now();
		System.out.println(now3);
		//ZoneId.of(null, null))
		
	}

}
