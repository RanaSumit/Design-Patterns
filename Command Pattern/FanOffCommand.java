
/**
 * Write a description of class FanOffCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FanOffCommand implements Command
{
    private Fan myFan;
    
    
    public FanOffCommand(Fan F)
    {
        myFan = F;
        
    }
    
    
    public void execute()
    {
        myFan.stopRotate();
    }
}
