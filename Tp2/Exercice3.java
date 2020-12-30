import java.util.Scanner;
class Exercice3{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          System.out.println("Entrez un nombre");
          int nbun=sc.nextInt();
          System.out.println("Entre un deuxième nombre");
          int nbdeux=sc.nextInt();
          int somme=nbun+nbdeux;
          System.out.println(nbun+"+"+nbdeux+"="+somme);
    }
}