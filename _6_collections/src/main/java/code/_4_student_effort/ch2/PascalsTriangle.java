package code._4_student_effort.ch2;

public class PascalsTriangle {
    static final int n=11;

    private static void display(int[] arr,int line){
        if(line%2==0 && n%2!=0 || line%2!=0 && n%2==0)
            System.out.print(' ');
        System.out.print("  ".repeat((n-line)/2));
        for(int i=0;i<line;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] pascal=new int[1];
        int[] prev;
        for(int i=0;i<n;i++){
            prev=pascal;
            pascal=new int[i+1];
            pascal[0]=1;
            pascal[i]=1;
            for(int j=1;j<i;j++)
                pascal[j]=prev[j-1]+prev[j];
            display(pascal,i+1);
        }
    }
}
