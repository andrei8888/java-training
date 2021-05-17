package code._3_in_class.ch2;

public class Studio {
    private String nume;
    private Film[] filme;

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public boolean hasMoreThan2(){
        return filme.length > 2;
    }

    public boolean hasCertainActor(String nume){
        for(int i=0;i<filme.length;i++)
            if(filme[i].hasCertainActor(nume))
                return true;
        return false;
    }

}
