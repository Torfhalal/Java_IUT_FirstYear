class SegmentTest {
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
