package code._4_student_effort.ch2;

import code._3_in_class.io.ch1.Contact;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMain {
    public static void main(String[] args) {
        String inputFile="./_test_files/in/message.txt";
        String word,secretMessage="";
        char character;
        try{
            Scanner s=new Scanner((new BufferedReader(new FileReader(inputFile))));
            while(s.hasNext()){
                word=s.next();
                for(int c=0;c<word.length();c++){
                    character=word.charAt(c);
                    if(Character.isUpperCase(character)){
                        if(character!='X')
                            secretMessage+=character;
                        else
                            secretMessage+=' ';
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.print(secretMessage);
    }
}
