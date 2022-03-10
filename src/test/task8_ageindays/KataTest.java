package task8_ageindays;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
        LocalDate birthday = LocalDate.now().minusDays(2);
        assertEquals("You are 2 days old",
                Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    }

    @Test
    public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
        LocalDate birthday = LocalDate.now().minusYears(1);
        if (LocalDate.now().isLeapYear()) {
            assertEquals("You are 366 days old",
                    Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        } else {
            assertEquals("You are 365 days old",
                    Kata.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        }
    }
}