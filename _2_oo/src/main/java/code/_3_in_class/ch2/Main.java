package code._3_in_class.ch2;

public class Main {
    public static void main(String[] args){
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu doua oscaruri",35,new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000",36,new Premiu[]{oscar1990});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018",35,new Premiu[]{oscar2018});
        Actor actorFaraPremii1 = new Actor("actor fara premii 1",35,new Premiu[]{});
        Actor actorFaraPremii2 = new Actor("actor fara premii 2",35,new Premiu[]{});
        Actor actorFaraPremii3 = new Actor("actor fara premii 3",51,new Premiu[]{});

        Film film1 = new Film(1990,"film1",new Actor[]{actorOscar1990,actorFaraPremii1});
        Film film2 = new Film(2010,"film1",new Actor[]{actorFaraPremii2,actorFaraPremii1,actorFaraPremii3});
        Film film3 = new Film(2010,"film1",new Actor[]{actorFaraPremii2,actorFaraPremii1,actorFaraPremii3});
        Film film4 = new Film(2018,"film1",new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii3});
        Film film5 = new Film(2018,"film1",new Actor[]{actorFaraPremii2,actorFaraPremii3});

        Studio s1 = new Studio("MGM",new Film[]{film1,film2});
        Studio s2 = new Studio("Disney",new Film[]{film3,film4,film5});

        Studio[] studioDB = new Studio[]{s2,s1};

        System.out.print("Name of studios with more than 2 movies: ");
        for(int i=0;i<studioDB.length;i++)
            if(studioDB[i].hasMoreThan2())
                System.out.print(studioDB[i].getNume()+" ");
        System.out.println();

        System.out.print("Name of studios in which plays \'actor cu doua oscaruri\': ");
        for(int i=0;i<studioDB.length;i++)
            if(studioDB[i].hasCertainActor("actor cu doua oscaruri"))
                System.out.print(studioDB[i].getNume()+" ");
        System.out.println();

        System.out.print("Movies with at least one actor above 50: ");
        Film[] filme = null;
        for(int i=0;i<studioDB.length;i++)
            filme=studioDB[i].getFilme();
            for(int j=0;j<filme.length;j++)
                if(filme[j].hasActorAbove50())
                    System.out.print(filme[j].getNume()+" ");
        System.out.println();
    }
}
