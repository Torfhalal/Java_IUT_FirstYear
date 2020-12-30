public class Segment{

    //attributs privés a et b
    private Point a;
    private Point b;




    //constructeur par défaut qui initialise un segment de (0,0) à (0,1)
    public Segment(){
    a = new Point(0,0);
    b = new Point(0,1);
    }


    //constructeur prenant 2 points en paramètres
    public Segment (Point c, Point d){
    this.a= c;
    this.b= d;
    }
    

    //constructeur prenant 4 entiers en paramètres
    public Segment (int x1, int y1, int x2, int y2){
    this.a =new Point(x1,y1);
    this.b=new Point(x2,y2);
    }


    //méthode longueur
    public double longueur(){
    double l;
    int px,py;
    px = a.getX() - b.getX();
    py = a.getY() - b.getY();
    l = Math.sqrt(px*px + py*py); 
    return l;
    }

    // méthode retournant une chaîne de caractèré sous le format (x1,y1) - (x2,y2)
    public String toString() {
    return "(" + a.getX() + "," + a.getY() + ") - (" + b.getX() + "," + b.getY() + ")" ;
    }

    public Point getA(){
    return this.a;}

    public Point getB(){
    return this.b;}



    public static void main(String args[]) {
        // test du constructeur par défaut
        Segment s = new Segment() ;
        System.out.println(s) ; // doit afficher "(0,0) - (1,0)"
        // test du constructeur avec initialisation par deux points
        Point p1 = new Point() ;
        Point p2 = new Point(1,2) ;
        s = new Segment(p1, p2) ;
        System.out.println(s) ; // doit afficher "(0,0) - (1,2)"
        // test du constructeur avec initialisation par 4 'indice'
        s = new Segment(3,4,5,6) ; // doit afficher "(3,4) - (5,6)"
        System.out.println(s) ;
        // test du calcul de la longueur
        System.out.println(s.longueur()) ; // doit afficher 2,828...
        }


}