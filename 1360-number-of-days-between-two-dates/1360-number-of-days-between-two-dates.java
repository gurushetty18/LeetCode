class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(calcDays(date1) - calcDays(date2));
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private int daysInMonth(int year, int month) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    private int calcDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int days = 0;
        // Add days for full years since 1971
        for (int y = 1971; y < year; y++) {
            days += isLeapYear(y) ? 366 : 365;
        }
        // Add days for full months in current year
        for (int m = 1; m < month; m++) {
            days += daysInMonth(year, m);
        }
        // Add days in current month
        days += day;

        return days;
    }
}
