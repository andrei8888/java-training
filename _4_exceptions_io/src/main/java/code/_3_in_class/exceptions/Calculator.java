package code._3_in_class.exceptions;

public class Calculator {
    private int divideBy(int nr) throws CheckedException {
        if(nr==0)
            throw new CheckedException();
        return 110/nr;
    }
    public int calculate(int number){
        int result=0;
        if(number==3){
            throw new UncheckedException();
        }
        try {
            result=divideBy(number)*33;
        } catch (CheckedException e) {
            e.printStackTrace();
            System.out.print("Divide by zero !! not allowed");
            result=33;
        }
        return result;
    }
}
