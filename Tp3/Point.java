public class Point{

      //attributs privés x et y
      int x;
      private int y;


      //constructeur par défaut qui initialise un point en (0,0)
      //https://docs.oracle.com/javase/7/docs/api/java/awt/Point.html
      //Point p = new Point();
        public Point(){
            x = 0 ;
            y = 0 ;
        }

      //constructeur avec initialisation des attributs
      public Point (int a, int b){
          this.x=a;
          this.y=b;
          //return p;
      }


      //méthode d'accès aux attributs
      public int getX(){
          return this.x;}

      public int getY(){
          return this.y;}


      //méthode pour fixer une nouvelle valeur aux coordonnées
      public void setX(int a){
          this.x= a;}

      public void setY(int b){
          this.y=b;}


      //méthode pour retourner une chaîne de caractères
      public String toString() {
        return "(" + x + "," + y + ")" ;
        }




        public static void main(String args[]) {
            //  test du constructeur par defaut
            Point p = new Point() ;
            System.out.println(p) ;
            // test du constructeur avec initialisation
            p = new Point (1, 2) ;
            System.out.println(p) ;
            // test des setteurs
            p.setX(3) ;
            p.setY(4) ;
            // test des getteurs
            System.out.println(p.getX()) ;
            System.out.println(p.getY()) ;
            //  test de toString
            System.out.println(p) ;
            }
}