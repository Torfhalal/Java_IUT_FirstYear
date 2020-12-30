class Case {

    // attributs privé joueur
    private int joueur;

    // constructeur par défaut qui initialise la case vide (0)
    public Case() {
        joueur = 0;
    }

    // constructeur prenant en compte l'état de la case
    // si différent de 0, 1 ou 2 alors la case est mise à 0(vide)
    public Case(int valeur) {
        if (valeur == 0 || valeur == 1 || valeur == 2) {
            joueur = valeur;
        } else {
            joueur = 0;
        }

    }

    // méthode retournant une chaîne de caractères
    public String toString() {
        return "La case" + "(" + i + "," + j + ")" + "appartient au joueur" joueur.getJoueur() + ".";
    }

    // accesseur
    public int getJoueur() {
        return this.joueur;
    }

    // définisseur
    public int setJoueur(int a) {
        if (a == 0 || a == 1 || a == 2) {
            joueur = a;
        } else {
            this.joueur = 0;
            System.out.println("Il n'y a que 2 joueurs, valeurs possiblent: 0, 1 ou 2");
        }
    }

    // Ne pas mettre de main ici ni dans Plateau.java
}