package code._4_student_effort.ch3;

public class GenericNode<T> implements IGenericNode<T> {
    private T data;
    private IGenericNode<T> next;

    @Override
    public T getValue() {
        return data;
    }

    @Override
    public void setValue(T value) {
        this.data=value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next=next;
    }
    
}
