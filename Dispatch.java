package chapter8;
class M{
	void callme20() {
		System.out.println("Inside M is callme method. ");
	}
}
class N extends M{
	void callme20() {
		System.out.println("Inside N is callme method. ");
	}
}
class Z extends M{
	void callme20() {
		System.out.println("Inside Z is callme method. ");
	}
}
public class Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m=new M();
		N n=new N();
		Z z=new Z();
		M r;
		r=m;
		r.callme20();
		r=n;
		r.callme20();
		r=z;
		r.callme20();
		
		

	}

}
