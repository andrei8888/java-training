package code._4_student_effort.ch2;

public class BubleSort implements SortingStrategy{

    @Override
    public void sort(Integer[] list) {
        boolean k;
        do{
            k=false;
            for(int i=0;i<list.length-1;i++)
                if(list[i]>list[i+1]){
                    k=true;
                    Integer aux = list[i];
                    list[i] = list[i+1];
                    list[i+1] = aux;
                }
        }while(k);
    }
}
