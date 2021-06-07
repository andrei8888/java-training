package code._3_in_class.ch1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    public <F extends Currency,T extends Currency>T convert(F from, Class<T> toClass, float rate) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T result=null;

        float currentValue = from.getValue();
        result = toClass.getDeclaredConstructor().newInstance();
        result.setValue(currentValue*rate);

        return result;
    }
}
