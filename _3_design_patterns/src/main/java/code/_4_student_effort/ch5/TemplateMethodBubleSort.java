package code._4_student_effort.ch5;

public abstract class TemplateMethodBubleSort {

    void sort(Integer[] list){
        boolean k=false;
        do{
            k=false;
            for(int i=0;i<list.length-1;i++)
                if(!numbersInCorrectOrder(list[i],list[i+1])){
                    k=true;
                    Integer aux=list[i];
                    list[i]=list[i+1];
                    list[i+1]=aux;
                }
        }while(k);
    }
    abstract boolean numbersInCorrectOrder(Integer i1,Integer i2);
}
