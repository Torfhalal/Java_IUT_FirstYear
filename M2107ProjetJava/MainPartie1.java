import java.util.ArrayList;
import MG3D.geometrie.*;

class MainPartie1{

    public static ArrayList<Arete> genereArete(Maillage m){
        // TODO - voir l'algorithme dans le sujet
        ArrayList<Arete> tab = new ArrayList<Arete>();  
        
        for (int i = 0 ; i < m.getNbFaces(); i ++){
            Face f = m.getFace(i); //renvoi une face 
            
            int s1 = f.getS1();
            int s2 = f.getS2();
            int s3 = f.getS3();
            Arete a1 = new Arete(s1,s2);
            if (!tab.contains(a1)){
                tab.add(a1);
            }
            Arete a2 = new Arete(s1,s3);
            if (!tab.contains(a2)){
                tab.add(a2);
            }
            Arete a3 = new Arete(s2,s3);
            if (!tab.contains(a3)){
                tab.add(a3);
            }
        }
        return tab; 
    }  
    public static boolean verificationSurfaceFermee(Maillage m){
        // TODO - aide : V-E+F=2
        int ok = m.getNbSommets()-genereArete(m).size()+m.getNbFaces();
        return (ok == 2);
        
    }
    
        
        /**
    * Méthode permettant de calculer s'il y a une intersection 
    * entre le rayon défini par son origine et un vecteur directeur 
    * et le triangle formé par les trois sommets.
         * @param origineRayon Origine du rayon
         * @param rayon Direction du rayon
         * @param sommet0 premier sommet du triangle
         * @param sommet1 seconde sommet du triangle
         * @param sommet2 troisième sommet du triangle
         * @return retourne vrai s'il y a intersection, faux sinon.
         */
    public static boolean mollerTrumbore(Point3D origineRayon, Vecteur3D rayon, Sommet sommet0, Sommet sommet1, Sommet sommet2) {
        
        
        double EPSILON = 0.0000001;
        boolean verif = false ;
        Vecteur3D a1 = new Vecteur3D(sommet0,sommet1);
        Vecteur3D a2 = new Vecteur3D(sommet0,sommet2);
        Vecteur3D h = rayon.produitVectoriel(a2);
        double ps = a1.produitScalaire(h);
        
	if (ps > -EPSILON && ps < EPSILON)
            return false;
        double f = (1/ps);
        Vecteur3D s = new Vecteur3D(sommet0,origineRayon);
        double u = f*(s.produitScalaire(h));
        if (u < 0 || u > 1)
            return false; 
        Vecteur3D q = s.produitVectoriel(a1);
        double v = f*(s.produitScalaire(h));
        if (v < 0 || u+v > 1)
            return false;
        double t = f*(a2.produitScalaire(q));
        if (t > EPSILON && t < (1-EPSILON)){
            verif = true;
        }
        return verif;
    }

    /*J'ajoute cette partie pour montrer notre recherche

        public static boolean mollerTrumbore(Point3D origineRayon, Vecteur3D rayon, Sommet sommet0, Sommet sommet1, Sommet sommet2) {
        int EPSILON = 0.0000001 ;
        public Vecteur3D arete1(Point3D sommet0, Point3D sommet1){
            this.dx = sommet1.getX()-sommet0.getX();
            this.dy = sommet1.getY()-sommet0.getY();
            this.dz = sommet1.getZ()-sommet0.getZ();
        }

        public Vecteur3D arete2(Point3D sommet0, Point3D sommet2){
            this.dx = sommet2.getX()-sommet0.getX();
            this.dy = sommet2.getY()-sommet0.getY();
            this.dz = sommet2.getZ()-sommet0.getZ();
        }

        public Vecteur3D produitVectoriel(Vecteur3D rayon, Vecteur3D arete2){
            return  h(arete2.getDy()*rayon.getDz()-arete2.getDz()*rayon.getDy(), arete2.getDz()*rayon.getDx()-arete2.getDx()*rayon.getDz(), arete2.getDx()*rayon.getDy()-arete2.getDy()*rayon.getDx());
        }
        int h = h ;

        public double produitScalaire(Vecteur3D h, Vecteur3D arete1){
            return a(arete1.getDx()*h.getDx()+arete1.getDy()*h.getDy()+arete1.getDz()*h.getDz());
        }
        int a=a ;

        if (a>(-EPSILON) && a<EPSILON){
            return false ;
        }

        int f = 1/a ;
        public Vecteur3D s(Point3D sommet0, Point3D origineRayon) {
            this.dx = origineRayon.getX()-sommet0.getX();
            this.dy = origineRayon.getY()-sommet0.getY();
            this.dz = origineRayon.getZ()-sommet0.getZ();
        }

        public double produitScalaire(Vecteur3D s, Vecteur3D h, Vecteur3D f){
             p = h.getDx()*s.getDx()+h.getDy()*s.getDy()+h.getDz()*s.getDz();
            return u(f*p) ;
        }
        int u = u ;

        if (u<0 || u>1){
            return false ;
        }

        public Vecteur3D produitVectoriel(Vecteur3D s, Vecteur3D arete1){
            return  q(arete1.getDy()*s.getDz()-arete1.getDz()*s.getDy(), arete1.getDz()*s.getDx()-arete1.getDx()*s.getDz(), arete1.getDx()*s.getDy()-arete1.getDy()*s.getDx());
        }

        public double produitScalaire(Vecteur3D rayon, Vecteur3D q, Vecteur3D f){
            p = q.getDx()*rayon.getDx()+q.getDy()*rayon.getDy()+q.getDz()*rayon.getDz();
           return v(f*p) ;
        }
        int v = v ;

        if (v<0 || u+v>1){
            return false ;
        }

        public double produitScalaire(Vecteur3D arete2, Vecteur3D q, Vecteur3D f){
            p = q.getDx()*arete2.getDx()+q.getDy()*arete2.getDy()+q.getDz()*arete2.getDz();
           return t(f*p) ;
        }
        int t = t ;

        if (t>EPSILON && t<(1-EPSILON)){
            return true ;
        }

        return false ;
    } 
    
    */
        
    
        
    public static boolean verificationAutoIntersection(Maillage m){
        // TODO - voir l'algorithme dans le sujet
        ArrayList<Arete> tabArete= genereArete(m);
        int nbAretes = tabArete.size();
        int nbFaces = m.getNbFaces();
        for (int i = 0; i < nbAretes; i++){
            Arete a = tabArete.get(i);
            int indiceOrigine =  a.getS1();
            int indiceExtremite = a.getS2();
            Sommet origine = m.getSommet(indiceOrigine);
            Sommet extremite = m.getSommet(indiceExtremite);
            double x = origine.getX();
            double y = origine.getY();
            double z = origine.getZ();
            Point3D origineArete = new Point3D(x,y,z);
            Vecteur3D arete = new Vecteur3D(origine,extremite);
            for (int j = 0; j < nbFaces; j++){
                Face f = m.getFace(j);
                int s1 = f.getS1();
                int s2 = f.getS2();
                int s3 = f.getS3();
                Sommet sommet1 = m.getSommet(s1);
                Sommet sommet2 = m.getSommet(s2);
                Sommet sommet3 = m.getSommet(s3);
                if (mollerTrumbore(origineArete, arete, sommet1, sommet2, sommet3) == true){
                    return true;
                }
            }
        }
        return false;
    }
        
        
    public static void main(String[] args){
        if(args.length!=1){
            System.out.println("usage : java MainPartie1 fichier.off");
            System.exit(0);
        }
        String fichier=args[0];
        Maillage m = new Maillage(fichier);
        if (!verificationAutoIntersection(m) && !verificationSurfaceFermee(m))
            System.out.println("Le maillage triangulaire n’est pas imprimable car la surface n’est pas fermée et il présente au moins une auto-intersection.");
        else if (!verificationAutoIntersection(m))
            System.out.println("Le maillage triangulaire n’est pas imprimable car il présente au moins une auto-intersection.");
        else if (!verificationSurfaceFermee(m))
        System.out.println("Le maillage triangulaire n’est pas imprimable car la surface n’est pas fermée");
        else if (verificationAutoIntersection(m) && verificationSurfaceFermee(m))
            System.out.println("Le maillage triangulaire est imprimable");
        }
    }
    
