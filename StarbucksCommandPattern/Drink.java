
/**
 * Write a description of class Drink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drink implements Command
{
   private CoffeeMachine coffeeMachine;
   
   public Drink(CoffeeMachine coffeeMachine)
   {
       this.coffeeMachine = coffeeMachine;
    }
    
   public void execute()
   {
       coffeeMachine.drink();
   }
    
   
}
