class Arete {
    
    private int s1 ;
    private int s2 ; 

    public Arete(){
        this.s1 = 0;
        this.s2 = 1;
    }
    public Arete(int ss1, int ss2){
        this.s1 = ss1;
        this.s2 = ss2;
    }
    public Arete(Arete a){
        this.s1 = a.s1;
        this.s2 = a.s2;
    }
    public int getS1(){
        return(this.s1);
    }
    public void setS1(int a){
        this.s1 = a;
    }
    public int getS2(){
        return(this.s2);
    }
    public void setS2(int a){
        this.s2 = a;
    }
    public boolean equals(Arete a){
        if (this == a) return true;
        if (a == null) return false ;
        if (getClass() != a.getClass()) return false;
        return s1 == a.s1 && s2 == a.s2 || s1== a.s2 && s2 == a.s1;
    }
    public String toString(){
        return "("+s1+","+s2+")";
    }
}
