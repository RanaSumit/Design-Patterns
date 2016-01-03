
/**
 * Write a description of class Decaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Decaf implements Command
{
    
   private CoffeeMachine coffeeMachine;
   
   public Decaf(CoffeeMachine coffeeMachine)
   {
       this.coffeeMachine = coffeeMachine;
    }
    
   public void execute()
   {
       coffeeMachine.decaf();
   }
    
   
}
