package lt.academy.java.basics;

public class Operators {
    public static void main(String[] args) {
        String space = " ";
        int a = 4;
        int b = 2;
        int c = 3;

        if(a==b && a==c && b==c) {
            System.out.println("Triangle is Equilateral.Sides " + a + space + b + space + c);
        } else if(a==b || a==c || b==c) {
            System.out.println("Triangle is Scalene.Sides: " + a + space + b + space + c);
        }

        if(a!=b && a!=c && b!=c) {
            System.out.println("Triangle is Scalene.Sides: " + a + space + b + space + c);
        }

    }

}
