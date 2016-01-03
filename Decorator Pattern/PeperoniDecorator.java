
/**
 * Write a description of class PeperoniDecorator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeperoniDecorator extends Decorator
{
    private String addedState;
    public PeperoniDecorator (Component c)
    {
        
     super(c);
    }
    
    public String makePizza()
    {
        addedState = super.makePizza();
        return addedState + " Peperoni added !!";
    }
}
