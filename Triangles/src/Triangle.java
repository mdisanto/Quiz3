
public class Triangle {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3){
		
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	public double side1Get(){
		return side1;
	}
	
	public double side2Get(){
		return side2;
	}
	
	public double side3Get(){
		return side3;
	}
	
	public double getPerimeter(){
		return (side1+side2+side3);
	}
	
	public double getArea(){
		
		double p = side1+side2+side3;
		return (Math.sqrt(p*(p - side1)*(p-side2)*(p-side3)));
	}
	
	public String toString(){
		return ("Triangle with sides length "+ Double.toString(side1)+ " " + Double.toString(side2)+ " " + Double.toString(side3)+ " ");
	}
}
