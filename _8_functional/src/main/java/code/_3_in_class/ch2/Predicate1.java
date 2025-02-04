package code._3_in_class.ch2;

import junit.framework.Assert;
import org.junit.Test;

import java.util.function.Predicate;

public class Predicate1 {
    @Test
    public void predicate_1(){
        Predicate<String> p1 = s->s.isEmpty();
        Predicate<String> notPredicate = p1.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty"));
    }

    @Test
    public void predicate_2(){
        Predicate<String> p1 = s -> s!=null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = p1.and(p2);
        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("null"));
    }

    @Test
    public void predicate_3(){
        Predicate<String> p1 = s -> s.length()==4;
        Predicate<String> p2 = s -> s.startsWith("J");
        Predicate<String> p3= p1.and(p2).negate();
        Assert.assertTrue(p3.test("True"));
        Assert.assertTrue(p3.test("Julia"));
        Assert.assertFalse(p3.test("Java"));

    }
}
