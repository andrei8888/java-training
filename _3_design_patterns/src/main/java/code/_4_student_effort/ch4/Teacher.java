package code._4_student_effort.ch4;

public class Teacher implements ObservedSubject {
    Observer[] observers;

    public Teacher(){
        observers=new Observer[0];
    }
    @Override
    public void register(Observer obj) {
        Observer[] dummy=observers;
        observers=new Observer[dummy.length+1];
        for(int i=0;i<dummy.length;i++)
            observers[i]=dummy[i];
        observers[dummy.length]=obj;
    }

    @Override
    public void unregister(Observer obj) {
        int k=observers.length;
        for(int i=0;i<observers.length;i++)
            if(obj==observers[i]) {
                k=i;
                break;
            }
        if(observers.length==k)
            return;
        for(int i=k;i<observers.length-1;i++)
            observers[i]=observers[i+1];
        Observer[] dummy=observers;
        observers=new Observer[dummy.length-1];
        for(int i=0;i<observers.length;i++)
            observers[i]=dummy[i];
    }

    @Override
    public void notifyObservers(String message) {

    }

    public void teach(String topic){
        for(int i=0;i<observers.length;i++)
            observers[i].update(topic);
    }
}
