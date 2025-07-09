public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 10000) {
            if (year % 4 == 0) {
                return year % 100 == 0 ? year % 400 == 0 : true;
            }
        }
        return false;
    }
    
    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999)
            return -1;
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> (isLeapYear(year) ? 29 : 28);
            default -> -1;
        };
    }
}

