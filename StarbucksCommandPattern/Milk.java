
/**
 * Write a description of class Milk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Milk implements Command
{
   private CoffeeMachine coffeeMachine;
   
   public Milk(CoffeeMachine coffeeMachine)
   {
       this.coffeeMachine = coffeeMachine;
    }
    
   public void execute()
   {
       coffeeMachine.milk();
   }
    
   
}

