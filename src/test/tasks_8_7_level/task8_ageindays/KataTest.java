package tasks_8_7_level.task8_ageindays;

import org.junit.jupiter.api.Test;
import tasks_8_7_level.task8_ageindays.Kata;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
        LocalDate birthday = LocalDate.now().minusDays(2);
        assertEquals("You are 2 days old",
                tasks_8_7_level.task8_ageindays.Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    }

    @Test
    public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
        LocalDate birthday = LocalDate.now().minusYears(1);
        if (LocalDate.now().isLeapYear()) {
            assertEquals("You are 366 days old",
                    tasks_8_7_level.task8_ageindays.Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        } else {
            assertEquals("You are 365 days old",
                    Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        }
    }
}