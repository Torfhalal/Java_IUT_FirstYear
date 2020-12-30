import java.util.Scanner;

class Exercice3{
    public static void main(String[] args){

        int [] tableauCompteur = new int [256];
        //for(int i=1;i<256;i++){System.out.println(tableauCompteur[i]);}

        System.out.println("Veuillez entrer une chaîne de caractères:");
        Scanner scanner = new Scanner(System.in);
        String entree=scanner.nextLine();
        int longueur = entree.length();
        
        for(int value = 0; value<longueur;value++){
            char caractere = entree.charAt(value);
            char c = caractere;
            int ascii = (int) c;
            tableauCompteur[ascii]=tableauCompteur[ascii]+1;
        }

        for(int value = 0; value<256;value++){
            if(tableauCompteur[value]!=0){
            int ascii2 = value;
            char lettre = (char) ascii2;
            System.out.println(lettre+" "+tableauCompteur[value]);
            }
        }
    }
}