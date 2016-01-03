
/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
   public static void main(String[] args)
   {
       Handler h1 = new ConcreteHandler1();
       Handler h2 = new ConcreteHandler2();
       Handler h3 = new ConcreteHandler3();
       
       h1.setSuccessor(h2);
       h2.setSuccessor(h3);
       
       System.out.println("RX Passed");
       h1.handleRequest("RX");
       System.out.println("R1 Passed");
       h1.handleRequest("R1");
       
       System.out.println("R3 Passed");
       h1.handleRequest("R3");
       System.out.println("R2 Passed");
       h1.handleRequest("R2");
       
       
    }
}
