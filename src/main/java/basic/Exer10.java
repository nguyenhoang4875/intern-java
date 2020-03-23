package basic;

import java.time.LocalDate;

public class Exer10 {

    public String findDayOfWeek(int year, int month, int day) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }
}
