public class Client
{
   public static void main(String[] args)
   {
       CoffeeMachine coffeeMachine = new CoffeeMachine();
       Decaf decaf = new Decaf(coffeeMachine);
       Shots shots = new Shots(coffeeMachine);
       Milk milk = new Milk(coffeeMachine);
       Robot robot = new Robot(coffeeMachine);
       Drink drink = new Drink(coffeeMachine);
       
       
       Invoker invoker = new Invoker(decaf, shots, milk, drink, robot);
       invoker.robot();
       invoker.decaf();
       invoker.shots();
       invoker.milk();
       invoker.drink();    
       
   }
}
