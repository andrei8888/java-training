package code._4_student_effort.ch3;

public class GenericList<T> implements IGenericList<T> {
    IGenericNode<T> head=null;
    IGenericNode<T> current=null;

    public GenericList(T headValue){
        this.head=new GenericNode<>();
        this.head.setValue(headValue);
        current=head;
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> newNode = new GenericNode<>();
        newNode.setValue(element);
        current.setNext(newNode);
        current=newNode;
    }

    @Override
    public void println() {
        for(IGenericNode<T> it=head;it!=current;it=it.getNext())
            System.out.print(it.getValue()+" ");
        System.out.println(current.getValue());
    }
    
}
