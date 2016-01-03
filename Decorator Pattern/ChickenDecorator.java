
/**
 * Write a description of class Chicken_Decorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChickenDecorator extends Decorator
{
    private String addedState;
    
    public ChickenDecorator(Component c)
    {
        super(c);
        
    }
    
    
    public String makePizza()
    {
        addedState = super.makePizza();
        return addedState + " Chicken Added !!";
        
    }
}
