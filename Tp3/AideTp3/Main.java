class Main{

    public static void main(String[] args){
	Point p1 = new Point();
	Point p2 = new Point();

	p1.setX(1);p1.setY(1);
	p2.setX(3);p2.setY(5);
	Segment s1 = new Segment(p1,p2);

	p1.setX(3);p1.setY(-8);
	p2.setX(-1);p2.setY(6);
	Segment s2 = new Segment(p1,p2);
	
	System.out.println(s1);
	System.out.println(s2);
    }
}
