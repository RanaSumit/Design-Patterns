
public class OffState implements State
{
    public void execute(Context context)
    {
        System.out.println("System is in Off State !!");
        context.setState(this);
        
        
    }
}
