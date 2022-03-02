package lt.academy.java.basics;

public class Arithmetics {
    public static void main(String[] args) {
        double inchToCentimeter = 2.54;
        float foot = 2.4F;
        int inch = 4;
        double centimeters = inch*inchToCentimeter+foot*12*inchToCentimeter;


        System.out.println(foot + " feet and " + inch + " inches = " +centimeters + " cm" );


    }
}
