package chapter8;
abstract class  A11{
	abstract void callme();
	void callmetoo() {
		System.out.println("this is a concreat method .");
	}
	
}
class B11 extends A11{
	void callme() {
		System.out.println("B is implimantation of callme. ");
	}

	
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B11 b=new B11();
		b.callme();
		b.callmetoo();

	}

}
