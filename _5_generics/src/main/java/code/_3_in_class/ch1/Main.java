package code._3_in_class.ch1;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ExchangeDesk exchangeDesk=new ExchangeDesk();
        RON ron=new RON(23);
        USD usd=exchangeDesk.convert(ron,USD.class,4.05f);
        System.out.println(usd);

        EUR eur=exchangeDesk.convert(ron,EUR.class,5.01f);
        System.out.println(eur);
    }
}