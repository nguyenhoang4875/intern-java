package basic;

import java.time.LocalDate;

public class Exer11 {

    public String findMonthName(int month) {
        if (month < 1 || month > 12) {
            return "";
        } else {
            return LocalDate.of(2020, month, 1).getMonth().toString();
        }
    }
}
