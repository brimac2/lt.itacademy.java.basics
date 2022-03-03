package lt.academy.java.basics;

public class Loops {
    public static void main(String[] args) {
//        int daysPerYear = 365;
//        int hoursPerOneDay = 24;
//        int minutesPerOneDay = 60*hoursPerOneDay;
//
//        int minutesPerYear = 0;
//        int hoursPerYear = 0;
//
//        int i = 0;
//        while (i<daysPerYear) {
//            minutesPerYear += minutesPerOneDay;
//            hoursPerYear += hoursPerOneDay;
//            i++;
//        }
//
//        System.out.println("There are " + hoursPerYear + " hours or " + minutesPerYear + " minutes in one year.");

        int factorialNumber = 5;
        int factorialSum = factorialNumber;
        int cycleCount = factorialNumber - 1;
        int baseFactorial = factorialNumber;

        for (int i = 0; i < cycleCount; i++){
                factorialSum = factorialSum * --factorialNumber;
        }
        System.out.println("Factorial of number " + baseFactorial  + " is " + factorialSum);
    }
}


