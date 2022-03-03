package lt.academy.java.basics;

public class Loops {
    public static void main(String[] args) {
        int daysPerYear = 365;
        int hoursPerOneDay = 24;
        int minutesPerOneDay = 60*hoursPerOneDay;

        int minutesPerYear = 0;
        int hoursPerYear = 0;

        int i = 0;
        while (i<daysPerYear) {
            minutesPerYear += minutesPerOneDay;
            hoursPerYear += hoursPerOneDay;
            i++;
        }
        System.out.println("There are " + hoursPerYear + " hours or " + minutesPerYear + " minutes in one year.");

    }
}
