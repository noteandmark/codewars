package tasks_8_7_level.task8_ageindays;

import java.time.LocalDate;

public class Kata {
    public static String ageInDays(int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Long days = today.toEpochDay() - birthday.toEpochDay();
        return "You are " + days + " days old";
    }
}
