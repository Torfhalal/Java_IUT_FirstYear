class Main{
    public static void main(String[] args){

        /*Entrée des coordonnées X et Y
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
        }*/

        //Affichage de la grille
        String sortie = new String();  
        System.out.println(sortie.toString());

        //Entrée des coordonnées X et Y
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel joueur joue ?");
        Case player = sc.nextCase();
        System.out.println("Saisissez la coordonnée de X :");
        int coX = sc.nextInt();
        sc.nextLine();
        System.out.println("Saisissez la coordonnée de Y :");
        int coY = sc.nextInt();
    }
}