package exo2;

public class Main {
    public static void main (String[] args){
        int numberInt = 1234;
        float numberFloat = 1234;

        System.out.println(numberInt);
        System.out.println(numberFloat);

        int numberInt2 = 123456789;
        float numberFloat2 = 123456789;

        System.out.println(numberInt2);
        System.out.println(numberFloat2);

        /*
        * Result into console
        * 1234
        * 1234.0
        * 123456789
        * 1.23456792E8
        * */

        float x = 15;
        float z = 0;
        float y = -123;
        float a = x / z;
        float b = y / z;
        float c = a / b;

        // Display
        System.out.println("x =" + x);
        System.out.println("z =" + z);
        System.out.println("y =" + y);
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);


    }

}
