public class Invoker
{
   Command decaf, shots, milk, drink, robot ;
   public Invoker(Command decaf,Command shots,Command milk,Command drink,Command robot)
   {
       this.decaf = decaf;
       this.shots = shots;
       this.milk = milk;
       this.drink = drink;
       this.robot = robot;      
    }
    void decaf()
    {
        decaf.execute();
    }
    void shots()
    {
        
        shots.execute();
    }
    void milk()
    {
        
        milk.execute();
    }
    void drink()
    {
        
        drink.execute();
    }
    void robot()
    {
        
        robot.execute();
    }
}
