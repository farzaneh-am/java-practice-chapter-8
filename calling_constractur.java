package chapter8;
class A10{
	A10(){
		System.out.println("Insid A10 constractur.");
	}
	}
class B10 extends A10{
	B10(){
		System.out.println("Insid B10 constractur.");
	}
}
class C10 extends B10{
	C10(){
		System.out.println("Insid C10 constractur.");
	}
}
public class calling_constractur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C10 c=new C10();

	}

}
