package code._4_student_effort.ch3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AnagramMain {
    boolean cont(int x[], int k){
        for(int i=0;i<k;i++)
            if(x[i]==x[k])
                return false;
        return true;
    }

    void printAnagram(int x[],String str){
        BufferedWriter outputFile=null;
        try {
            outputFile=new BufferedWriter(new FileWriter("./_test_files/out/output.txt",true));
            for (int i = 0; i < x.length; i++)
                outputFile.write(str.charAt(x[i]));
            outputFile.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputFile!=null) {
                try {
                    outputFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

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
    public static void main(String[] args) throws IOException {
        String stringToAnagramify="listen";
        AnagramMain anagramMain=new AnagramMain();
        FileWriter f=new FileWriter("./_test_files/out/output.txt",false);
        f.write("");
        f.close();
        anagramMain.back(stringToAnagramify);
    }
}