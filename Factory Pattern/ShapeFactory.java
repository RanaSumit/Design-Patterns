
/**
 * Write a description of class ShapeFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShapeFactory
{
    
    public Shape getShape(String shapeType)
    {
        if(shapeType == null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }
        return null;
    }
}
