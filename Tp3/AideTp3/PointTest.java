class PointTest {
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
