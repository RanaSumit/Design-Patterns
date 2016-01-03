
/**
 * Write a description of class BinaryOberver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BinaryObserver implements Observer{

    Subject subject = new Subject();
   public BinaryObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
}