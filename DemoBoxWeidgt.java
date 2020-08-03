package chapter8;
class Box{
	double width,heigh,depth;
	
	Box(Box ob) {
		width=ob.width;
		heigh=ob.heigh;
		depth=ob.depth;
	}
	Box(double w,double h,double d) {
		width=w;
		heigh=h;
		depth=d;
	}
	
	Box() {
		width=-1;
		heigh=-1;
		depth=-1;
	}
	Box(double len) {
		width=heigh=depth=len;
	}
	
	double volom() {
		return width*heigh*depth;
		
	}
	
}
class Boxweight extends Box{
	double weight;
	Boxweight(double w,double h,double d,double m) {
		width=w;
		heigh=h;
		depth=d;
		weight=m;
	}
	
}
class colorBox extends Box{
	String color;
	colorBox(double w,double h,double d, String c){
		width=w;
		heigh=h;
		depth=d;
		color=c;
	}
	void colorprint() {
		System.out.println("result is :"+((width*heigh)-(depth)) +"  color is :"+color);
	}
}
public class DemoBoxWeidgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxweight mybox1=new Boxweight(10,20,15,34.3);
		Boxweight mybox2=new Boxweight(2,3,4,0.076);
		double vol;
		vol=mybox1.volom();
		System.out.println("volom of mybox1 is:"+vol);
		System.out.println("weight of mybox1 is:"+mybox1.weight);
		System.out.println();
		vol=mybox2.volom();
		System.out.println("volom of mybox1 is:"+vol);
		System.out.println("weight of mybox1 is:"+mybox2.weight);
		colorBox mybox3=new colorBox(5,9,4,"red");
		System.out.println();
		mybox3.colorprint();
		

	}

}
