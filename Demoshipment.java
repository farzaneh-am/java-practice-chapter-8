package chapter8;
class box8{
	private double width,heigh,depth;
	box8(double w,double h,double d) {
		width=w;
		heigh=h;
		depth=d;
	}
	box8(box8 ob) {
		width=ob.width;
		heigh=ob.heigh;
		depth=ob.depth;
	}
	
	box8() {
		width=-1;
		heigh=-1;
		depth=-1;
	}
	box8(double len) {
		width=heigh=depth=len;
	}
	
	double volom() {
		return width*heigh*depth;
		
	}
	
}
class boxweight8 extends box8{
	double weight;
	boxweight8(double w,double h,double d,double m) {
		super(w,h,d);
		weight=m;
	}
	

boxweight8(boxweight8 ob) {
	super(ob);
	weight=ob.weight;
}
boxweight8() {
	super();
	weight=-1;
}
boxweight8(double len,double m) {
	super(len);
	weight=len;
}
}
class shipment extends boxweight8{
	double cost;
	shipment(double w,double h,double d,double m,double c) {
		super(w,h,d,m);
		cost=c;
	}
	

	shipment(shipment ob) {
	super(ob);
	cost=ob.cost;
}
	shipment() {
	super();
	cost=-1;
}
	shipment(double len,double m, double c) {
	super(len,m);
	cost=c;
}
	
}
public class Demoshipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shipment shipment1=new shipment(10,20,15,10,3.41);
		shipment shipment2=new shipment(2,3,4,0.76,1.28);
		double vol;
		vol=shipment1.volom();
		System.out.println("volom of shipment1 is:"+vol);
		System.out.println("weight of shipment1 is:"+shipment1.weight);
		System.out.println(" shiping cost:$"+shipment1.cost);
		System.out.println();
		
		vol=shipment2.volom();
		System.out.println("volom of shipment2 is:"+vol);
		System.out.println("weight of shipment2 is:"+shipment2.weight);
		System.out.println(" shiping cost:$"+shipment2.cost);
		System.out.println();
	}

}
