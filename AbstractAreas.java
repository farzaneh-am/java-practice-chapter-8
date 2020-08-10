package chapter8;
abstract class Figure1{
	double dim1,dim2;
	Figure1(double a,double b){
		dim1=a;
		dim2=b;
	}
	Figure1(double a){
		dim1=a;
		
	}
	abstract double  area1();
	
}
class circle1 extends Figure1{
	circle1(double a){
		super(a);
		
	}
	double area1() {
		System.out.println("Inside Area For circle : ");
		return dim1*dim1*3.14;
	}
}
class rectangle1 extends Figure1{
	rectangle1(double a,double b){
		super(a,b);
	}
	
		double area1(){
			System.out.println("Inside Area For Rectangle: ");
			return dim1*dim2;
	}
	
}

class triangle1 extends Figure1{
	triangle1(double a,double b){
		super(a,b);
	}
	
		double area1(){
			System.out.println("Inside Area For triangle: ");
			return dim1*dim2/2;
	}
	
	}

public class AbstractAreas {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		rectangle1 r=new rectangle1(9,5);
		triangle1 t=new triangle1(10,8);
		circle1 c=new circle1(2);
		Figure1 figuref;
		figuref=r;
		System.out.println("Area is : "+figuref.area1());
		
		figuref=t;
		System.out.println("Area is : "+figuref.area1());
		
		
		figuref=c;
		System.out.println("Area is : "+figuref.area1());
		
	}

}
