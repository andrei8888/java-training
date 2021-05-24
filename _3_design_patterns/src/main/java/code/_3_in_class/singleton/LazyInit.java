package code._3_in_class.singleton;

public class LazyInit {
    static private LazyInit instance;
    private LazyInit(){
    }

    public static LazyInit getInstance(){
        if(instance==null)
            instance=new LazyInit();
        return instance;
    }

}