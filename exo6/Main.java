package exo6;

public class Main {
    public static void main (String[] args){
        int counter = Integer.parseInt(args[0]);
        System.out.println("Factorielle de " + counter);
        int result = 1;
        for (int i = 1 ; i <= counter ; i++){
            result = result * i;
            System.out.println("Calcul " + result);
        }
        System.out.println("Le resulat est " + result);
    }
}
