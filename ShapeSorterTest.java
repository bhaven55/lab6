import org.junit.Assert;
import org.junit.Test;

/**
 * Lab 6
 *
 * Test class for ShapeSorter.
 * Implicitly tests that the comparators are implemented correctly.
 *
 * @author Stephen
 * @version 2019-02-18
 */
public class ShapeSorterTest
{
	/**
	 * Test that shapes are added correctly.
	 */
	@Test
	public void AddShapeTest()
	{
		ShapeSorter sorter = new ShapeSorter();

		Shape a = new Rectangle("test", 3, 3);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);

		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(0), a);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(1), b);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(2), c);
		Assert.assertEquals("Shapes added incorrectly...", sorter.shapes.get(3), d);
	}

	/**
	 * Tests sorting via the default ordering.
	 */
	@Test
	public void SortShapesDefaultTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 1, 9);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(); // the order should be b, d, c, a
		
		Assert.assertEquals("The default ording is incorrect", b, sorter.shapes.get(0));
		Assert.assertEquals("The default ording is incorrect", d, sorter.shapes.get(1));
		Assert.assertEquals("The default ording is incorrect", c, sorter.shapes.get(2));
		Assert.assertEquals("The default ording is incorrect", a, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by area ordering.
	 */
	@Test
	public void SortShapesAreaTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 1, 10);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 3);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapeAreaComparator()); // b, d, c, a
		
		Assert.assertEquals("SortShapesAreaTest failed", b, sorter.shapes.get(0));
		Assert.assertEquals("SortShapesAreaTest failed", d, sorter.shapes.get(1));
		Assert.assertEquals("SortShapesAreaTest failed", c, sorter.shapes.get(2));
		Assert.assertEquals("SortShapesAreaTest failed", a, sorter.shapes.get(3));
	}

	/**
	 * Tests sorting by perimeter ordering.
	 */
	@Test
	public void SortShapesPerimeterTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 1, 10);
		Shape b = new EquilateralTriangle("test2", 4);
		Shape c = new Square("test3", 4);
		Shape d = new Circle("test4", 1.5);

		sorter.addShape(a);
		sorter.addShape(b);
		sorter.addShape(c);
		sorter.addShape(d);
		
		sorter.sortShapes(new ShapePerimeterComparator()); // d, b, c, a
		
		Assert.assertEquals("SortShapesAreaTest failed", d, sorter.shapes.get(0));
		Assert.assertEquals("SortShapesAreaTest failed", b, sorter.shapes.get(1));
		Assert.assertEquals("SortShapesAreaTest failed", c, sorter.shapes.get(2));
		Assert.assertEquals("SortShapesAreaTest failed", a, sorter.shapes.get(3));
		
	}

	/**
	 * Tests the toString.
	 */
	@Test
	public void ToStringTest()
	{
		// TODO: complete this...
		ShapeSorter sorter = new ShapeSorter();
		
		Shape a = new Rectangle("test", 1, 10);
		Shape b = new EquilateralTriangle("test2", 4);
		
		sorter.addShape(a);
		sorter.addShape(b);
		
		Assert.assertEquals("toString format is not correct", sorter.shapes.get(0).toString() + "\n" + sorter.shapes.get(1).toString() + "\n", sorter.toString());

	}
}
