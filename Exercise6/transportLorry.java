package Exercise6;

import java.util.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class transportLorry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed, distance;
		System.out.println("Enter the speed at which the lorry travels: ");
		speed = sc.nextInt(); // speed in km/hr
		System.out.println("Enter the distance to be travelled: ");
		distance = sc.nextInt(); // distance in km
		System.out.println("Enter the year, month and day of starting: ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println("Enter the time of starting the travel: ");
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		LocalTime time = LocalTime.of(hour, minute);

		// Calculate the estimated time to reach the destination in hours
		double estimatedTime = (double) distance / speed;

		// Calculate the number of full days required for the journey
		int fullDays = (int) estimatedTime / 8;

		// Calculate the remaining hours after the full days
		int remainingHours = (int) estimatedTime % 8;

		// Add the full days to the starting date
		LocalDate estimatedDate = date.plusDays(fullDays);

		// Check if the estimated date of reaching the destination is a holiday
		while (isHoliday(estimatedDate) || (estimatedDate.getDayOfWeek() == DayOfWeek.SUNDAY)) {
			estimatedDate = estimatedDate.plusDays(1);
		}

		// Calculate the estimated time of reaching the destination in hours and minutes
		int estimatedHours = time.getHour() + remainingHours;
		int estimatedMinutes = time.getMinute();
		if (estimatedHours >= 24) {
			estimatedDate = estimatedDate.plusDays(1);
			estimatedHours -= 24;
		}

		// Create the estimated arrival time
		LocalTime estimatedTimeOfDay = LocalTime.of(estimatedHours, estimatedMinutes);
		LocalDateTime estimatedTimeOfArrival = LocalDateTime.of(estimatedDate, estimatedTimeOfDay);
		System.out.println("Estimated time of arrival: " + estimatedTimeOfArrival);
	}

	private static boolean isHoliday(LocalDate date) {

		// Check if the estimated date is a Sunday
		if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return true;
		}

		// Check if the estimated date is a Second Saturday
		if (date.getDayOfMonth() >= 8 && date.getDayOfMonth() <= 14 && date.getDayOfWeek() == DayOfWeek.SATURDAY) {
			return true;
		}

		// Check if the estimated date is January 1,15,26
		if (date.getMonth() == Month.JANUARY
				&& (date.getDayOfMonth() == 1 || date.getDayOfMonth() == 15 || date.getDayOfMonth() == 26)) {
			return true;
		}

		// Check if the estimated date is a Sunday between 12am and 12pm
		if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			LocalTime startTime = LocalTime.of(0, 0);
			LocalTime endTime = LocalTime.of(12, 0);
			LocalDateTime startDateTime = LocalDateTime.of(date, startTime);
			LocalDateTime endDateTime = LocalDateTime.of(date, endTime);
			return startDateTime.isBefore(LocalDateTime.now()) && endDateTime.isAfter(LocalDateTime.now());

		}
		return false;

	}
}
