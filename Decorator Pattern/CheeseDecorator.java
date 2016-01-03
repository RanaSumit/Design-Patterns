
/**
 * Write a description of class CheeseDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheeseDecorator extends Decorator
{
    
    private String addedState;
    
    public CheeseDecorator(Component c)
    {
        super(c);
    }
    public String makePizza()
    {
        addedState = super.makePizza();
        return addedState + " Cheese Added !!";
        
    }
}
