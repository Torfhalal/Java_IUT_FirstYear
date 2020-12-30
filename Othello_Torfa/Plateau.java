class Plateau {

    // Un attribut privé de type tableau statique à 2 dimensions de Case
    Case plateau[][];

    // Un constructeur par défaut permettant d’instancier un tableau de 8 × 8 et de
    // créer tous les objets de type Case
    public Plateau() {
    plateau = new Case[8][8];
        for (int value = 0; value <= 7; value++) {
            for (int valuetwo = 0; valuetwo <= 7; valuetwo++) { 
                plateau[value][valuetwo] = new Case();
            }
        }
        //Placement des 4 pions de départ
        plateau[3][3].setJoueur(1);
        plateau[4][4].setJoueur(1);
        plateau[3][4].setJoueur(2);
        plateau[4][3].setJoueur(2);
    }
    

    public Case getXY(int i, int j) {
        if (i >= 0 && i <= 7 && j >= 0 && j <= 7) { 
	    return plateau[i][j];
        }
        else{
            System.out.println("Sortie du plateau");
	    System.exit(0);
	    return new Case();
        }
    }

    private boolean coupPossible(int coX, int coY, int player){
        if (player == 1){
            int opposant = 2;
        }
        else{
            int opposant = 1;
        }

        if (plateau[coX][coY].getJoueur() == 0){
            if (plateau[coX-1][coY+1].getJoueur() == 0){
                return false;
            }
            if (plateau[coX-1][coY+1].getJoueur() == player){
                return false;
            }
                
			if (plateau[coX-1][coY+1].getJoueur() == opposant){
                if (plateau[coX-2][coY+2].getJoueur() == player){
                    return true;
                }
                if (plateau[coX-2][coY+2].getJoueur() == 0){
                    return false;
                }
                if (plateau[coX-3][coY+3].getJoueur() == opposant){
                    if (plateau[coX-3][coY+3].getJoueur() == player){
                        return true;
                    }
                    if (plateau[coX-3][coY+3].getJoueur() == 0){
                        return false;
                    }
                    if (plateau[coX-3][coY+3].getJoueur() == opposant){
                        //Je dois faire une boucle while tant que (boolean = false && i<8) pour éviter d'avoir un code à rallonge
                    }
                }
            }
        }
    }

    // Un attribut privé de type booléen permettant de savoir si la partie est terminée
    // Une partie se termine lorsque le plateau est plein ou si personne ne peut jouer.
    // Cette méthode peut être utile en simplifiant un peu les règles.
    private boolean plein(){
	boolean plein=true;
	    for (int value = 0; value <= 7; value++){
		for (int valuetwo = 0; valuetwo <= 7; valuetwo++){
		    if (plateau[value][valuetwo].getJoueur() == 0) {
			plein = false;
		    }
		}
	    }
	return plein;
    }

    //méthode retournant le joueur gagnant (avec le plus de pions)
    private String gagne(){
        int blanc = 0;
        int noir = 0;
        for (int value = 0; value <= 7; value++){
            for (int valuetwo = 0; valuetwo <= 7; valuetwo++){
                if (plateau[value][valuetwo].getJoueur() == 1){
                    blanc = blanc + 1;
                }
                if(plateau[value][valuetwo].getJoueur() == 2){
                    noir = noir + 1;
                }
            }
        }
        if (blanc > noir){
            return "Le joueur blanc gagne la partie";
        }
        if (blanc < noir){
            return "Le joueur noir gagne la partie";
        }
        if (blanc == noir){
            return "Égalité";
        }
        //Obligatoire selon le terminal (pas de return trouvé)
        return "";
    }
    

    // CORRRECTION : ok mais ca serait bien d'utiliser des boucles !
    // méthode retournant le plateau
    public String toString() {
        return
        plateau[0][0] + "|" + plateau[0][1] + "|" + plateau[0][2] + "|" + plateau[0][3] + "|" + plateau[0][4] + "|" + plateau[0][5] + "|" + plateau[0][6] + "|" + plateau[0][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[1][0] + "|" + plateau[1][1] + "|" + plateau[1][2] + "|" + plateau[1][3] + "|" + plateau[1][4] + "|" + plateau[1][5] + "|" + plateau[1][6] + "|" + plateau[1][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[2][0] + "|" + plateau[2][1] + "|" + plateau[2][2] + "|" + plateau[2][3] + "|" + plateau[2][4] + "|" + plateau[2][5] + "|" + plateau[2][6] + "|" + plateau[2][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[3][0] + "|" + plateau[3][1] + "|" + plateau[3][2] + "|" + plateau[3][3] + "|" + plateau[3][4] + "|" + plateau[3][5] + "|" + plateau[3][6] + "|" + plateau[3][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[4][0] + "|" + plateau[4][1] + "|" + plateau[4][2] + "|" + plateau[4][3] + "|" + plateau[4][4] + "|" + plateau[4][5] + "|" + plateau[4][6] + "|" + plateau[4][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[5][0] + "|" + plateau[5][1] + "|" + plateau[5][2] + "|" + plateau[5][3] + "|" + plateau[5][4] + "|" + plateau[5][5] + "|" + plateau[5][6] + "|" + plateau[5][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[6][0] + "|" + plateau[6][1] + "|" + plateau[6][2] + "|" + plateau[6][3] + "|" + plateau[6][4] + "|" + plateau[6][5] + "|" + plateau[6][6] + "|" + plateau[6][7]+"\n"
        + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "-" + "\n" +
        plateau[7][0] + "|" + plateau[7][1] + "|" + plateau[7][2] + "|" + plateau[7][3] + "|" + plateau[7][4] + "|" + plateau[7][5] + "|" + plateau[7][6] + "|" + plateau[7][7];
    }
}
