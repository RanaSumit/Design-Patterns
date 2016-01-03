
/**
 * Write a description of class FanOnCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FanOnCommand implements Command
{
    Fan myFan;
    public FanOnCommand(Fan F)
    {
        myFan = F;
    }
    public void execute()
    {
       myFan.startRotate();
    }
}
