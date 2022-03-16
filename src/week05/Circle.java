package week05;

public class Circle extends Shape{
	private double radius;
	
	public Circle(String name, String color, double radius) {
		super(name, color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r) {
		this.radius = r;
	}
	public void setName(String s){
		if (s == "circle"){
			super.setName("dummy");
		}else{
			super.setName(s);
		}
	}
	public void setRadius(String r) {
		this.radius = Double.parseDouble(r);
	}
	public void displayProperties(){
		System.out.println("colour: " + this.getColor());
		System.out.println("name: " + this.getName());
		System.out.println("radius: " + radius);
	}
	
}