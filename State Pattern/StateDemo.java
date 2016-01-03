
public class StateDemo
{
   public static void main(String[] args)
   {
       Context context = new Context();
       
       
       
       OnState onState = new OnState();
       onState.execute(context);
       
       
       OffState offState = new OffState();
       offState.execute(context);
       
       SleepState sleepState = new SleepState();
       sleepState.execute(context);
       
       
    }
}
