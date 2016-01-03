
/**
 * Write a description of class Switch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Switch
{
    Command up, down;
    public Switch(Command UpCommand, Command DownCommand)
    {
        up = UpCommand;
        down = DownCommand;
    }
    
    void flipUp()
    {
        up.execute();
    }
    void flipDown()
    {
        down.execute();
    }
}
