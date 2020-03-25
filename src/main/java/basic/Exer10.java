package basic;

public class Exer10 {

    public String findDayOfWeek(int year, int month, int day) {
        if (!isDateValid(year, month, day)) {
            return "";
        } else {
            String[] dayOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
            if (month < 3) {
                month = month + 12;
                year = year - 1;
            }
            int index = (day + 2 * month + (3 * (month + 1)) / 5 + year + year / 4) % 7;
            return dayOfWeek[index];
        }
    }

    public boolean isDateValid(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return false;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                return false;
            }
        }
        if (month == 2) {
            if (day == 30) {
                return false;
            }
            if (day == 29) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
