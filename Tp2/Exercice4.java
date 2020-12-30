import java.util.Scanner;
class Exercice4{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int i=0;
          int end=0;
          int somme=0;
          int compt=0;
          int  moy=0;
          while (end==0){
            System.out.println("Entrez un nombre (ou fin pour terminer)");
            String mot=sc.next();
            int nb=Integer.parseInt(mot);
            if (mot.equals("fin"))
               {end=end+1;}
            else 
            { somme=somme+nb;
              compt=compt+1;}
            }
            moy=somme/compt;
            System.out.println("la somme est : "+somme);
            System.out.println("la moyenne est : "+moy);          
    }
}