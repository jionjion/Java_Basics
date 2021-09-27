package factory.method;

import factory.method.pizza.*;

/**
 *  抽象工厂方法,实现工厂
 * @author Jion
 */
public class NjPizzaMethodFactory extends AbstractPizzaMethodFactory {

    /** 抽象方法,在该子类中实现. */
    @Override
    public AbstractPizza createPizza(String type){
        AbstractPizza pizza = null;
        System.out.println(type);
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new NjCheesePizza();
            pizza.setName("南京 cheese");
        } else if ("greek".equalsIgnoreCase(type)) {
            pizza = new NjGreekPizza();
            pizza.setName("南京 greek");
        }
        return pizza;
    }
}