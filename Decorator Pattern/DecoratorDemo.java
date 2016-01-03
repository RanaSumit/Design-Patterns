
/**
 * Write a description of class DecoratorDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DecoratorDemo
{
    public static void main(String[] args)
    {
        
        Component obj = new CheeseDecorator( new ChickenDecorator( new PeperoniDecorator (new BaseConcreteComponent())));
        String myPizza = obj.makePizza();
        System.out.println(myPizza);
    }
}
