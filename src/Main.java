import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int choix;
        Scanner sn = new Scanner(System.in);
        Traitement traitement = new Traitement(sn);

        do {
            // Affichage du menu
            System.out.println("\nMenu des opérations sur une chaîne de caractères:");
            System.out.println("1. Saisir une chaîne");
            System.out.println("2. Afficher la chaîne");
            System.out.println("3. Inverser la chaîne");
            System.out.println("4. Compter le nombre de mots");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option (1-5): ");
            choix = sn.nextInt();// Lit un nombre et laisse le retour à la ligne
            sn.nextLine();// Consomme ce retour à la ligne laissé par nextInt()
            switch (choix) {
                case 1:
                    traitement.SaisirChaine();
                    break;
                case 2:
                    traitement.AfficherChaine();
                    break;
                case 3:
                    traitement.InverserChaine();
                    break;
                case 4:
                    traitement.NbreMots();
                    break;
                case 5:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 5);
        sn.close();
    }
}