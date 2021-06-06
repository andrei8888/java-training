package code._4_student_effort.ch5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class OccurenceMain {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> counter=new HashMap<>();
        Scanner scanner=new Scanner(new BufferedReader(new FileReader("_test_files/in/message.txt")));
        String currentWord="";
        while(scanner.hasNext()){
            currentWord=scanner.next();
            counter.put(currentWord, counter.containsKey(currentWord) ? counter.get(currentWord)+1 : 1);
        }
        List<Integer> list = new ArrayList<>(counter.values());
        Collections.sort(list);
        list=list.subList(list.size()-10,list.size());
        Iterator<Map.Entry<String, Integer>> it=null;
        Map.Entry<String, Integer> pair=null;
        for(int i=9; i>=0; i--){
            it = counter.entrySet().iterator();
            while(it.hasNext()) {
                pair = (Map.Entry<String, Integer>) it.next();
                if (pair.getValue() == list.get(i)) {
                    if(list.get(i)!=list.get(i-1) && i!=0) {
                        System.out.println(pair.getKey() + " : " + pair.getValue());
                        i--;
                        break;
                    }
                }
            }
        }
    }

}
