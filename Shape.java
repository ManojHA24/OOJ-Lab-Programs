abstract class Shape{
	double dim1;
	double dim2;
	Shape(double a,double b){
		dim1=a;
		dim2=b;
	}
	abstract double printArea();
}

class Rectangle extends Shape{
	Rectangle(double a,double b){
		super(a,b);
	}
	double printArea(){
		return dim1*dim2;
	}
}
class Triangle extends Shape{
	Triangle(double a,double b){
		super(a,b);
	}
	double printArea(){
		return dim1*dim2/2; 
	}
}
class Circle extends Shape{
	Circle(double a,double b){
		super(a,b);
	}
	double printArea(){
		return dim1*dim2*dim2;
	}
}
class ShapeMain{
	public static void main(String args[]){
		
		Rectangle r=new Rectangle(10,20);
		Triangle t=new Triangle(5,4);
		Circle c=new Circle(3.142,2);

		Shape shaperef;
		shaperef=r;
		System.out.println("Area of Rectangle:"+shaperef.printArea());
		shaperef=t; 
		System.out.println("Area of Triangle:"+shaperef.printArea());
		shaperef=c;
        System.out.println("Area of Cirle:"+shaperef.printArea());
	}
}