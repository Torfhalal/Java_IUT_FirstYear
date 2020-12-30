import java.util.Random;

class Exercice1 {
    public static void main(String[] args){
        int [] tableauAlea = new int [11];
        int max=0;
        for (int value = 1; value<11;value++){
            Random r = new Random();
            int valeur_alea= r.nextInt(100);
            tableauAlea[value]=valeur_alea;
        }
        for(int i=1;i<11;i++){
            if(tableauAlea[i]>max){
                max=tableauAlea[i];
            }
            System.out.println(tableauAlea[i]);
        }
        System.out.println("La valeur maximale est: "+max);
    }
}