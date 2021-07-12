package code._3_in_class.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamExample {
    public static Stream<String> callInCount(String line){
        System.out.println(line);
        return Stream.of(line.split(" "));
    }
    public static void main(String[] args) {
        List<String> list =new ArrayList<>(Arrays.asList("We are here","Try again"));
        Optional<String> count = list.stream().flatMap(line->{
            System.out.println(line);
            return Stream.of(line.split(" "));//StreamExample::callInCount
        }).findFirst();
        System.out.println("count="+count.get());
    }
}
