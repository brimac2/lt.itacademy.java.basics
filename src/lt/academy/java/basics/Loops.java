package lt.academy.java.basics;

public class Loops {
    public static void main(String[] args) {
        int daysPerYear = 365;
        int hoursPerOneDay = 24;
        int minutesPerOneDay = 60*hoursPerOneDay;

        int minutesPerYear = 0;
        int hoursPerYear = 0;

        for (int i = 0; i < daysPerYear; i++ ) {
            minutesPerYear += minutesPerOneDay;
            hoursPerYear += hoursPerOneDay;
        }

        System.out.println("There are " + hoursPerYear + " hours or " + minutesPerYear + " minutes in one year.");

    }
}
