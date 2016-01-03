
public class ConcreteHandler3 implements Handler
{
    private Handler successor = null;
    public void handleRequest(String request)
    {
        System.out.println("Handler3 got the request...");
        if(request.equalsIgnoreCase("R3"))
        {
            System.out.println("Request handled by Handler3 !!!");
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
