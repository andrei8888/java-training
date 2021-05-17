package code._3_in_class.ch2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public String getNume() {
        return nume;
    }

    public boolean hasActorAbove50(){
        for(int i=0;i<actori.length;i++)
            if(actori[i].getVarst()>50)
                return true;
        return false;
    }

    public boolean hasCertainActor(String name){
        for(int i=0;i<actori.length;i++)
            if(actori[i].getNume().equals(name))
                return true;
        return false;
    }
}
