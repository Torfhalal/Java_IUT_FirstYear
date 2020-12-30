class Main{
    public static void main(String[] args){
        //Sélection de la taille de la grille
        Scanner sc = new Scanner(System.in);
        Systel.out.println("Veuillez entrer la taille de la grille");
        int taille = sc.nextInt();

        //Entrée des coordonnées X et Y
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel joueur joue ?");
        Case player = sc.nextCase();
        System.out.println("Saisissez la coordonnée de X :");
        int coX = sc.nextInt();
        sc.nextLine();
        System.out.println("Saisissez la coordonnée de Y :");
        int coY = sc.nextInt();

        //Placement des pions si possible
        if(Plateau[coX][coY] != 0){
            System.out.println("La case est déjà occupée, veuillez saisir d'autres coordonnées")
        }
        else{
            Plateau[coX][coY] = player;
        }

        //Sortie du joueur gagnant dans la console
        if(gagnant == true){
            System.out.println("Le joueur " + gagne + " a gagné la partie !");
            System.out.prinltl(" ");
            //Affichage de la grille
            String sortie = new String();  
            System.out.println(sortie);
        }
        else{
            System.out.println("Au tour de l'autre joueur !")
        }
    }
}