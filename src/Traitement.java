import java.util.Scanner;

public class Traitement {
    private Scanner sn;
    private String chaine="";
    public Traitement(Scanner sn) {
        this.sn = sn;
    }

    public void SaisirChaine() {
        System.out.println("entrer une chaine");
        chaine = sn.nextLine();
        System.out.println("Chaîne saisie avec succès!");

    }

    public void AfficherChaine() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne saisie.");
        } else {
            System.out.println("Chaîne saisie: " + chaine);
        }
        RetourAuMenu();
    }
    public void InverserChaine() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne saisie.");
        } else {
            String reversedString = new StringBuilder(chaine).reverse().toString();
            System.out.println("Chaîne inversée: " + reversedString);
        }
        RetourAuMenu();
    }

    public void NbreMots() {
        if (chaine.isEmpty()) {
            System.out.println("Aucune chaîne saisie.");
        } else {
            String[] words = chaine.trim().split("\\s+");//  le symbole \\s+ correspond à toute séquence d'espaces blancs (espaces, tabulations, etc.).
            int wordCount = words.length;
            System.out.println("Nombre de mots dans la chaîne: " + wordCount);
        }
        RetourAuMenu();
    }


    private void RetourAuMenu() {
        System.out.println("Frappez une touche pour revenir au menu...");
        sn.nextLine();
    }

}