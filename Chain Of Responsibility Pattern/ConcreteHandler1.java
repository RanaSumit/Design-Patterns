
public class ConcreteHandler1 implements Handler
{
   private Handler successor = null;
   
   public void handleRequest(String request)
   {
       System.out.println("Handler1 got the request....");
       if(request.equalsIgnoreCase("R1"))
       {
           System.out.println("Request Handled by Handler1 !! ");
        }
        else
        {
            if(successor != null)
            successor.handleRequest(request);
        }      
       
    }
    
    
    public void setSuccessor(Handler next)
    {
        this.successor = next;
        
    }
       
}
