package tasks_8_7_level.task40_leapyears;

public class LeapYears {
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}