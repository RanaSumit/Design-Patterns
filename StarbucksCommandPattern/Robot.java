
/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot implements Command
{
   private CoffeeMachine coffeeMachine;
   
   public Robot(CoffeeMachine coffeeMachine)
   {
       this.coffeeMachine = coffeeMachine;
    }
    
   public void execute()
   {
       coffeeMachine.robot();
   }
    
   
}
