class Plateau {

    // Un attribut privé de type tableau statique à 2 dimensions de Case
    Case Plateau[][] = new Case[taille][taille];

    // Un constructeur par défaut permettant d’instancier un tableau de 3 × 3 et de
    // créer tous les objets de type Case
    private Case thing;
    public plateau() {
        for (int value = 0; value <= 2; value++) {
            for (int valuetwo = 0; valuetwo <= 2; value++) {
                tableau[value][valuetwo] = joueur;
            }
        }
    }

    public int getXY(int i, int j) {
        if (i >= 0 && i <= 2) {
            if (j >= 0 && j <= 2) {
                return tableau[i][j];
            }
        }
        else{
            System.Out.println("Sortie du plateau");
        }
    }

    // Un attribut privé de type booléen permettant de savoir si la partie est
    // terminée
    private boolean plein(){
        return this.plein;
    }
    while (plein){
        for (int value = 0; value <= 2; value++){
            for (int valuetwo = 0; valuetwo <= 2; value++){
                if (tableau[value][valuetwo] != 0) {
                    boolean plein = true;
                }
                else {
                    boolean plein = false;
                }
            }
        }
    }

    //méthode permettant de savoir si un joueur a gagné
    private int gagne();


    // méthode retournant une chaîne de caractères
    public String toString() {
        return tableau[0][0] + | + tableau[0][1] + | + tableau[0][2] + "\n" +
        "-" + "-" + "-" + "-" + "-" + "\n" +
        tableau[1][0] + | + tableau[1][1] + | + tableau[1][2] + "\n" +
        "-" + "-" + "-" + "-" + "-" + "\n" +
        tableau[2][0] + | + tableau[2][1] + | + tableau[2][2] + "\n" 
        }
}