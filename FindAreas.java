package chapter8;
class Figure{
	double dim1,dim2;
	Figure(double a,double b){
		dim1=a;
		dim2=b;
	}
	double  area() {
		System.out.println("Area For Figure is underfined. ");
		return 0;
	}
}
class rectangle extends Figure{
	rectangle(double a,double b){
		super(a,b);
	}
	
		double area(){
			System.out.println("Inside Area For Rectangle: ");
			return dim1*dim2;
	}
	
}
class triangle extends Figure{
	triangle(double a,double b){
		super(a,b);
	}
	
		double area(){
			System.out.println("Inside Area For triangle: ");
			return dim1*dim2/2;
	}
	
}
public class FindAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure f=new Figure(10,10);
		rectangle r=new rectangle(9,5);
		triangle t=new triangle(10,8);
		Figure figuref;
		figuref=r;
		System.out.println("Area is : "+figuref.area());
		
		figuref=t;
		System.out.println("Area is : "+figuref.area());
		
		figuref=f;
		System.out.println("Area is : "+figuref.area());
		
		

	}

}
