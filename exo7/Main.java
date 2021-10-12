package exo7;

public class Main {
    public static void main(String[] args) {
        int chiffre = Integer.parseInt(args[0]);
        for (int k = 2; k <= chiffre; ) {
            int premier = 1;
            int tourDeBoucle = 0;
            for (int loop = 2; loop <= k; loop++) {
                if ((k % loop) == 0 && loop != k) {
                    premier = 0;
                }
                tourDeBoucle++;
                System.out.println("tour de boucle n°" + tourDeBoucle + " pour la boucle 'loop'");
            }
            if (premier != 0) {
                System.out.println(k + " est un nombre premier");
                k++;
            } else {
                k++;
            }
        }
    }
}
