

public class StrategyDemo
{
   public static void main(String[] args)
   {
      
       MathematicalStrategy additionStrategy = new AdditionStrategy();
       MathematicalStrategy substractionStrategy = new SubstractionStrategy();
       MathematicalStrategy multiplicationStrategy = new MultiplicationStrategy();
       additionStrategy.execute(6,2);
       substractionStrategy.execute(6,2);
       multiplicationStrategy.execute(6,2);
       
       
       
       
       
       
       
    }
}
