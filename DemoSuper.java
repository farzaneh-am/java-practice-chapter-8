package chapter8;
class box7{
	private double width,heigh,depth;
	box7(double w,double h,double d) {
		width=w;
		heigh=h;
		depth=d;
	}
	box7(box7 ob) {
		width=ob.width;
		heigh=ob.heigh;
		depth=ob.depth;
	}
	
	box7() {
		width=-1;
		heigh=-1;
		depth=-1;
	}
	box7(double len) {
		width=heigh=depth=len;
	}
	
	double volom() {
		return width*heigh*depth;
		
	}
	
}
class boxweight3 extends box7{
	double weight;
	boxweight3(double w,double h,double d,double m) {
		super(w,h,d);
		weight=m;
	}
	

boxweight3(boxweight3 ob) {
	super(ob);
	weight=ob.weight;
}
boxweight3() {
	super();
	weight=-1;
}
boxweight3(double len) {
	super(len);
	weight=len;
}
}
public class DemoSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boxweight3 mybox1=new boxweight3(10,20,15,34.3);
		boxweight3 mybox2=new boxweight3(2,3,4,0.076);
		boxweight3 mybox3=new boxweight3();
		boxweight3 mycube=new boxweight3(3,2);//Error ...There is no constructor with two arguments
		boxweight3 myclone=new boxweight3(mybox1);
		double vol;
		vol=mybox1.volom();
		System.out.println("volom of mybox1 is:"+vol);
		System.out.println("weight of mybox1 is:"+mybox1.weight);
		System.out.println();
		
		vol=mybox2.volom();
		System.out.println("volom of mybox2 is:"+vol);
		System.out.println("weight of mybox2 is:"+mybox2.weight);
		System.out.println();
		
		vol=mybox3.volom();
		System.out.println("volom of mybox3 is:"+vol);
		System.out.println("weight of mybox3 is:"+mybox3.weight);
		System.out.println();
		
		vol=mycube.volom();
		System.out.println("volom of mycube is:"+vol);
		System.out.println("weight of mycube is:"+mycube.weight);
		System.out.println();
		
		vol=myclone.volom();
		System.out.println("volom of myclone is:"+vol);
		System.out.println("weight of myclone is:"+myclone.weight);
		System.out.println();
	}

}
