package code._3_in_class.ch3;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaEx1 {
    public static void p1(List<String> strings){
        StringBuilder stringBuilder=new StringBuilder();
        strings.forEach(currentString -> stringBuilder.append(currentString.charAt(0)));
        System.out.println(stringBuilder);
    }
    public static void p2(List<String> strings){
        //strings.removeIf(item -> item.length()%2==0);
        strings=strings.stream().filter(item -> item.length()%2!=0)
                .collect(Collectors.toList());
        System.out.println(strings);
    }

    public static void p3(List<String> strings){
        strings=strings.stream().map(item -> item.toUpperCase(Locale.ROOT)).collect(Collectors.toList());
        System.out.println(strings);
    }

    public static String combineMap(Map<Integer,String> elements){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(elements.entrySet().stream().map(item -> {
            //System.out.println(item);
            return item.getKey()+" "+item.getValue();
        }).collect(Collectors.joining(", ")));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<String> list2=new ArrayList<>(Arrays.asList("a33","b4fd","cfds","first","second"));
        HashMap<Integer,String> elements = new HashMap<>();
        elements.put(1,"first");
        elements.put(3,"third");
        elements.put(2,"second");
        System.out.println(combineMap(elements));
    }
}
