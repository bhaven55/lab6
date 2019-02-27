
public class Rectangle extends Polygon
{
	//height of the rectangle
	private double height;
	
	//width of the rectangle
	private double width;
	
	/**
	 * Constructor for Rectangle object
	 * @param id The created shape's name id.
	 * @param height of the rectangle 
	 * @param width of the rectangle
	 */
	public Rectangle(String id, double height, double width)
	{
		super(id);
		
		this.height = height;
		this.width = width;
		
		super.sideLengths.add(height);
		super.sideLengths.add(width);
		super.sideLengths.add(height);
		super.sideLengths.add(width);
	}
	
	/**
	 * @return area of the rectangle: height * width
	 */
	public double getArea()
	{
		return height * width;
	}
	
	/**
	 * @return the Shape type of this object is Rectangle
	 */
	public String getShapeType()
	{
		return "Rectangle";
	}
}
