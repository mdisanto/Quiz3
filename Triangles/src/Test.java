import static org.junit.Assert.*;

public class Test {
	
	Triangle testTriangle = new Triangle(5, 12, 13);
	
	@Test
	public void testPerimeter(){
		assertTrue(testTriangle.getPerimeter()==30); 
	}
	
	@Test
	public void testArea(){
		assertTrue(testTriangle.getArea()==30); 
	}

}
