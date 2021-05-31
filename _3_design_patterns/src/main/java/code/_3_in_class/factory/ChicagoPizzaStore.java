package code._3_in_class.factory;

public class ChicagoPizzaStore extends PizzaStore{

  public Pizza createPizza(String type){
    Pizza pizza=null;
    if(type.equals("CHMargherita")){
      return new CHMargherita();
    }

    if(type.equals("CHQuatro")){
      return new CHQuatro();
    }

    return pizza;

  }
}