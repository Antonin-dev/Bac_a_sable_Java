package exo4;

public class Main {
    public static void main (String[] args){
        // Instruction conditionnelle avec if
        float value = Float.parseFloat(args[0]);
        if (value >= 5000){
            float result = (value / 100) * 95;
            System.out.println("Le montant remisé pour " + args[0] + " € est de " + result + " €");
        }else if (value >= 2000){
            float result = (value / 100) * 97;
            System.out.println("Le montant remisé pour " + args[0] + " € est de " + result + " €");
        }else if (value >= 1000){
            float result = (value / 100) * 99;
            System.out.println("Le montant remisé pour " + args[0] + " € est de " + result + " €");
        }else{
            System.out.println("Aucune remise pour " + args[0] + " €");
        }
        // Utilisation du switch
        int  weight = Integer.parseInt(args[1]);
        switch (weight){
            case 1 :
                System.out.println("Le sac est petit");
                break;
            case 2 :
                System.out.println("Le sac est moyen");
                break;
            default:
                System.out.println("Le sac est grand");
        }
    }
}
