package code._3_in_class.ch2;

public class Actor {
    private String nume;
    private int varst;
    private Premiu premii[];

    public Actor(String nume, int varst, Premiu[] premii) {
        this.nume = nume;
        this.varst = varst;
        this.premii = premii;
    }

    public int getVarst() {
        return varst;
    }

    public String getNume() {
        return nume;
    }
}
