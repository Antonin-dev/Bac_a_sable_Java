package exo5;

public class Main {
    public static void main (String[] args){
        int value = Integer.parseInt(args[0]);
        int counter = 0;
        while (counter != value){
            System.out.println(counter);
            counter++;
        }
    }
}
