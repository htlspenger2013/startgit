package at.spenger.git.start;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class Haupt {

	public static void main(String[] args) {
		System.out.println("Hallo Welt!");
		System.out.println("Ciao Mondo!");
		System.out.println("Hello World!");

		
		// ms seit 1.1.1970
		long timeStamp = Instant.now().toEpochMilli();
		
		String pattern = "yyyy.MM.dd";
		pattern = "yyyy-MM-dd";
		// Coordinated Universal Time (UTC)
		// based on International Atomic Time (TAI), introduced 1972
		// With leap seconds --> 2012 TAI has been 35 s ahead of UTC
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern).withZone(ZoneId.of("UTC"));
		
		System.out.println(dtf.format(Instant.now()));
		
		
		Period p = Period.between(LocalDate.parse("1968-09-27"), LocalDate.now());
		System.out.printf("Jahre: %d ", p.getYears());
		System.out.printf("Monate: %d Tage: %d", p.getMonths(), p.getDays());
		
	}

}
