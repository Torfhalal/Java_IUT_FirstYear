public class Carre{
    
    //attributs de type Segment
    Segment a;
    Segment b;
    Segment c;
    Segment d;

    //constructeur créant un carré ayant pour origine (0,0) et de côté 1
    public Carre(){
    a = new Segment(0, 0, 0, 1);
    b = new Segment(0, 1, 1, 1);
    c = new Segment(1, 1, 1, 0);
    d = new Segment(1, 0, 0, 0);
    }

    
    //constructeur avec origine et taille de côté
    public Carre(Point p, int n){
    a = new Segment(p.getX(), p.getY(), p.getX(), p.getY()+n);
    b = new Segment(p.getX(), p.getY()+n, p.getX()+n, p.getY()+n);
    c = new Segment(p.getX()+n, p.getY()+n, p.getX()+n, p.getY());
    d = new Segment(p.getX()+n, p.getY(), p.getX(), p.getY());
    }


    //calcul du pèrimètre
    public double perimetre() {
    double k;
    int px,py;
    px = a.getA().getX() - b.getA().getX();
    py = a.getB().getY() - b.getB().getY();
    k = Math.sqrt(px*px + py*py); 
    k = 4*k;
    return k;
    }

    // méthode retournant une chaîne de caractèré sous le format (x1,y1) - (x2,y2)
    public String toString() {
    return "(" + a.getA().getX() + "," + a.getA().getY() + ") - (" + a.getB().getX() + "," + a.getB().getY() + ")\n" +
    "(" + b.getA().getX() + "," + b.getA().getY() + ") - (" + b.getB().getX() + "," + b.getB().getY() + ")\n" +
    "(" + c.getA().getX() + "," + c.getA().getY() + ") - (" + c.getB().getX() + "," + c.getB().getY() + ")\n" +
    "(" + d.getA().getX() + "," + d.getA().getY() + ") - (" + d.getB().getX() + "," + d.getB().getY() + ")" ;
    }

    public static void main(String args[]) {
        // test du constructeur par defaut
        Carre c = new Carre() ;
        System.out.println("Carre \n"+c) ;
        System.out.println("De perimetre "+c.perimetre()) ;
        // test du constructeur avec valeurs d'initialisation
        Point p = new Point(0,0) ;
        c = new Carre(p, 2) ;
        System.out.println("Carre \n"+c) ;
        System.out.println("De perimetre "+c.perimetre()) ;
        }
}

// Le fichier Main.java créé 2 points, leurs affecte une valeur en X et en Y, créé un premier segment, puis redéfini les coordonées de ces deux points
// afin de créer un deuxième segment, au final on affiche les coordonnées des 2 points composants chacun des segments.
// Mais ici le segment 1 & 2 ont les mêmes coordonnées à la sortie, il faudrait créer un p3 et p4 pour le deuxième segment plutôt que de réutiliser p1 et p2.

// Utiliser un attribut Carre et un Point pour définir son origine serait plus optimale pour cette classe.