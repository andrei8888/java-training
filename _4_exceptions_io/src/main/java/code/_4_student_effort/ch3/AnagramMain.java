package code._4_student_effort.ch3;

public class AnagramMain {
    boolean cont(int x[], int k){
        for(int i=0;i<k;i++)
            if(x[i]==x[k])
                return false;
        return true;
    }

    void printAnagram(int x[],String str){
        for(int i=0;i<x.length;i++)
            System.out.print(str.charAt(x[i]));
        System.out.println();
    }

    void back(String str){
        int n=str.length();
        int k=0;
        int x[]=new int[n];
        x[k]=-1;
        while(k>=0){
            if(x[k]<n-1){
                x[k]++;
                if(cont(x,k))
                    if(k==n-1)
                        printAnagram(x,str);
                    else{
                        k++;
                        x[k]=-1;
                    }
            }
            else
                k--;
        }
    }
    public static void main(String[] args) {
        String stringToAnagramify="listen";
        AnagramMain anagramMain=new AnagramMain();
        anagramMain.back(stringToAnagramify);
    }
}