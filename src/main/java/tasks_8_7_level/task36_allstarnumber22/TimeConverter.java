package tasks_8_7_level.task36_allstarnumber22;

public class TimeConverter {
	public static String toTime(int seconds) {
		int hours;
		int minutes;
		hours = (int) Math.floor(seconds / 3600);
		minutes = (int) Math.floor((seconds - hours * 3600) / 60);
		return hours + " hour(s) and " + minutes + " minute(s)";
	}
}