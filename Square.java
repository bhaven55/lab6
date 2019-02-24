
public class Square extends Rectangle
{
	/**
	 * There are only two methods for this class.
	 * There are no other variables for this class.
	 */
	
	/**
	 * Constructor for this class
	 * @param size of the side of the square
	 */
	public Square(String id, double size)
	{
		super(id, size, size);
	}
	
	public String getShapeType()
	{
		return "Square";
	}
}
