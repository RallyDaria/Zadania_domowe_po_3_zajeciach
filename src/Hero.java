public class Hero {
       private String name;
       private  String klass;
       private int punktySily;
       private int punktyMana;
       private boolean nowaPostac;

    public Hero(String name,String klass, int punktySily, int punktyMana,boolean nowaPostac  ){
        this.name=name;
        this.klass=klass;
        this.punktySily=punktySily;
        this.punktyMana=punktyMana;
        this.nowaPostac=nowaPostac;
    }
    Hero(String imie,String klass,boolean nowaPostac){
        this.name=name;
        this.klass=klass;
        this.nowaPostac=nowaPostac;

    }
    public String showName() {
        return name;
    }
    public void changeName() {
        this.name=name;
    }
    public String showKlass(){
        return klass;
    }
    public void changeKlass(){
        this.klass=klass;
    }
    public int showPunktySily(){
        return punktySily;
    }
    public void  changePunktySily(){
        this.punktySily=punktySily;
    }
    public int showPunktyMana(){
        return punktyMana;
    }
    public void changePunktyMana(){
        this.punktyMana=punktyMana;
    }
    public boolean showNowaPostac(){
        return nowaPostac;
    }
    public void changeNowaPostac(){
        this.nowaPostac=nowaPostac;
    }
}

