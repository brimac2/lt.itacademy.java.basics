//Task 1
package lt.academy.java.basics;

public class Basics {
//Kaip islygiuoti???????
    public static void main(String[] args) {
        int number = 5;
        String levels = String.valueOf('#');
        String trunk = "#";

        for(int i = 0; i < number; i++){
            System.out.println(levels);
            levels += trunk;
        }

        System.out.println(trunk);
    }
}
