
/**
 * Write a description of class Shots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shots implements Command
{
   private CoffeeMachine coffeeMachine;
   
   public Shots(CoffeeMachine coffeeMachine)
   {
       this.coffeeMachine = coffeeMachine;
    }
    
   public void execute()
   {
       coffeeMachine.shots();
   }
    
   
}