import java.util.Scanner;

class Exercice2 {
    public static void main(String[] args){
        System.out.println("Veuillez entrer une chaîne de caractères:");
        Scanner scanner = new Scanner(System.in);
        String entree=scanner.nextLine();
        int longueur = entree.length();
        for(int value = 0; value<longueur;value++){
            char caractere = entree.charAt(value);
            char c = caractere;
            int ascii = (int) c;
            System.out.println("Le code ascii du caractère '"+caractere+"' est "+ascii);              
        }
    }
}