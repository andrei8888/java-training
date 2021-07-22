package lab1.ch3;

public class Pair2 {
    static int findNofPairs(int[] arr){
        int no=0;
        boolean[] freq=new boolean[arr.length];
        for(int i=0;i<freq.length;i++)
            freq[i]=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]==-arr[j] && freq[j]==false && freq[i]==false){
                    no++;
                    freq[i]=true;
                    freq[j]=true;
                    break;
                }
        }
        return no;
    }
    public static void main(String[] args){
        int[] array1={3,2,-3,-2,3,0};
        System.out.println(findNofPairs(array1));
        int[] array2={1,1,0,-1,-1};
        System.out.println(findNofPairs(array2));
        int[] array3={5,9,-5,7,-5};
        System.out.println(findNofPairs(array3));
        int[] array4={1,2,-1,3,-3,-2,-1,-1,1};
        System.out.println(findNofPairs(array4));
    }
}
