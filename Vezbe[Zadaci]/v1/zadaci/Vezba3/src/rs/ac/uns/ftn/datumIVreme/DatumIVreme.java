package rs.ac.uns.ftn.datumIVreme;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DatumIVreme {

	public static void primeriDatuma() {
		LocalDate currentLocalDate = LocalDate.now();
		System.out.println("Trenutni datum: " + currentLocalDate);
	
		LocalDate someLocalDate = LocalDate.of(2013, 10, 23);
		someLocalDate = someLocalDate.withYear(2015).withMonth(11).withDayOfYear(25);
		System.out.println("Pojedinacna izmena: " + someLocalDate);
		
		LocalDate parseLocalDate = LocalDate.parse("11.12.2014.", DateTimeFormatter.ofPattern("dd.MM.yyyy."));
		System.out.println("Parisanje datuma: " + parseLocalDate);
		
		parseLocalDate = parseLocalDate.minusDays(3).plusYears(5);
		System.out.println("Izmena datuma: " + parseLocalDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
	
	}
	
	
	public static void primeriVremena() {
		LocalTime parseLocalTime = LocalTime.parse("12:44:25");
		System.out.println("Parisanje vremena: " + parseLocalTime);
	}
	
	public static void primeriDatumaIVremena() {
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		System.out.println("Trenutni datum i vreme: " + currentLocalDateTime);
		
		LocalDateTime someLocalDateTime = LocalDateTime.of(2015, 3, 23, 10, 50);
		someLocalDateTime = someLocalDateTime.withYear(2011).withMinute(51);
		System.out.println("Izmen datuma i vremena: " + someLocalDateTime);
		
		LocalDateTime parseLocalDateTime = LocalDateTime.parse("23.05.1995. 13:35", DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm"));
		System.out.println("Parsirani datum i vreme: " + parseLocalDateTime);
		
		parseLocalDateTime = parseLocalDateTime.plusMinutes(10).minusHours(5);
		System.out.println("Izmena vremena i datuma: " + parseLocalDateTime.format(DateTimeFormatter.ofPattern("<dd.MM.yyyy. HH:mm>")));
	
	}
	
	public static void primeriZona() {
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
		System.out.println("Datum i vreme sa sistemskom zonom: " + zonedDateTime);
		
		System.out.println("Dostupne zone: " + ZoneId.getAvailableZoneIds());
		
		System.out.println("Datum i vreme sa odabranom zonom: " + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Denver")));
	}
		
	public static void main(String[] args) {
		//primeriDatuma();
		//primeriVremena();
		//primeriDatumaIVremena();
		primeriZona();
	}

}
