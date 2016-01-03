
/**
 * Write a description of class OnState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnState implements State
{
    public void execute(Context context)
    {
        System.out.println("System is in On State !!");
        context.setState(this);
        
    }
}
