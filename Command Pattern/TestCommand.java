
/**
 * Write a description of class TestCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCommand
{
    public static void main(String[] args)
    {
        Fan F = new Fan();
        FanOnCommand fOn = new FanOnCommand(F);
        FanOffCommand fOff = new FanOffCommand(F);
        
        
        Switch sw = new Switch(fOn, fOff);
        
        sw.flipUp();
        sw.flipDown();
    }
        
        
     
}
