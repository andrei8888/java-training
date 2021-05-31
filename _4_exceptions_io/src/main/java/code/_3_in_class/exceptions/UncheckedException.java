package code._3_in_class.exceptions;

public class UncheckedException extends RuntimeException {
    public UncheckedException(){
        super("Some exception you can't recover from");
    }
}
