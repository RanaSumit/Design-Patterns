

public class SleepState implements State
{
   public void execute(Context context)
   {
       System.out.println("System is in Sleep State !!");
       context.setState(this);
    }
}
