
/**
 * Write a description of class ConcreteHandler2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConcreteHandler2 implements Handler
{
   private Handler successor = null;
   public void handleRequest(String request)
   {
       System.out.println("Handler 2 got the request...");
       if(request.equalsIgnoreCase("R2"))
       {
           System.out.println("Request handled by Handler2 !!");
        }
        else
        {
            if(successor != null)
            {
                successor.handleRequest(request);
            }
        }
    }
    
    public void setSuccessor(Handler next)
    {
        this.successor = next;
    }
}
