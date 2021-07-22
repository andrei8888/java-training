package code._3_in_class.ch1;


import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class Main {
    static Flux<String> emptyFlux(){
        return Flux.empty();
    }
    public static Flux<String> fooBarflux(){
        return Flux.just("Bar","Foo");
    }

    public static Flux<String> fooBarFromList(){
        return Flux.fromIterable(Arrays.asList("Foo","Bar"));
    }

    public static Flux<String> errorFlux(){
        return Flux.error(IllegalStateException::new);
    }

    public static Flux<Long> counter(){
        return Flux.interval(Duration.ofMillis(100));
    }

    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        fooBarflux().subscribe(System.out::println);
        fooBarFromList().subscribe(System.out::println);
        counter().subscribe(System.out::println);
    }
}