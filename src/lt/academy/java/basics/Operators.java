package lt.academy.java.basics;

public class Operators {
    public static void main(String[] args) {
//        String space = " ";
//        int a = 4;
//        int b = 2;
//        int c = 3;
//
//        if(a==b && a==c && b==c) {
//            System.out.println("Triangle is Equilateral.Sides " + a + space + b + space + c);
//        } else if(a==b || a==c || b==c) {
//            System.out.println("Triangle is Scalene.Sides: " + a + space + b + space + c);
//        }
//
//        if(a!=b && a!=c && b!=c) {
//            System.out.println("Triangle is Scalene.Sides: " + a + space + b + space + c);
//        }


        double priceOfLiter = 1.25;
        int happyDestination = 110;
        double happyFuelInTank = 25;
        double happyUsage100Kilometres = 7;
        double usedFuel = happyDestination*happyUsage100Kilometres/100;
        double happyHowMuchLeft = happyFuelInTank-usedFuel;

        if (happyHowMuchLeft >= 0) {
            System.out.println("Destionation is in " + happyDestination + " km." + "Car is able to reach destination. It will have " + happyHowMuchLeft + " liter of fuel left.");
        } else {
            double howMuchNeedFuelOfLiter = happyHowMuchLeft * -1;
            double howMuchIsCost = howMuchNeedFuelOfLiter * priceOfLiter;
            System.out.println( "Destionation is in " + happyDestination + " km." + "Car is not able to reach the destination." + "It needs " + howMuchNeedFuelOfLiter + " liter of fuel more. It will cost " + howMuchIsCost);
        }
    }

}
