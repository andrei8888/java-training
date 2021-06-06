package code._4_student_effort.ch4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LCDMain {
    static int width=3,height=2;
    static String[] firstRow={
            " _ ",  //0
            "   ",  //1
            " _ ",  //2
            " _ ",  //3
            "   ",  //4
            " _ ",  //5
            " _ ",  //6
            " _ ",  //7
            " _ ",  //8
            " _ ",  //9
    };
    static String[] secondRow={
            "| |",  //0
            "  |",  //1
            " _|",  //2
            " _|",  //3
            "|_|",  //4
            "|_ ",  //5
            "|_ ",  //6
            "  |",  //7
            "|_|",  //8
            "|_|",  //9
    };
    static String[] lastRow={
            "|_|",  //0
            "  |",  //1
            "|_ ",  //2
            " _|",  //3
            "  |",  //4
            " _|",  //5
            "|_|",  //6
            "  |",  //7
            "|_|",  //8
            " _|",  //9
    };


    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(new BufferedReader(new FileReader("./_test_files/in/input_number.txt")));
        int n=scanner.nextInt();
        String[] text={"","",""};

        if(width!=1){

        }
        String strNum = "" + n;
        int strLength = strNum.length(),digit;
        for (int i = 0; i < strLength; i++) {
            digit = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            text[0]+=firstRow[digit];
            text[1]+=secondRow[digit];
            text[2]+=lastRow[digit];
        }
        scanner.close();
        FileWriter fileWriter=new FileWriter("./_test_files/out/output_number.txt");
        fileWriter.write(text[0]+'\n'+text[1]+'\n'+text[2]);
        fileWriter.close();
    }
}
