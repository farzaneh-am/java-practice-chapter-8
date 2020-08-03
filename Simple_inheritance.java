package chapter8;
class A{
	int i,j;
	void showij() {
		System.out.println("i and j: "+i+" "+j);
	}
}
class B extends A{
	int k;
	void showk() {
		System.out.println("k : "+k);
	}
	void sum() {
		System.out.println("i+j+k= "+(i+j+k));
		
	}
}
public class Simple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A superob=new A();
B subob=new B();
superob.i=10;
superob.j=20;
System.out.println("content of superob = ");
superob.showij();
System.out.println();
subob.i=7;
subob.j=8;
subob.k=9;
System.out.println("content of subob = ");
subob.showij();
subob.showk();
System.out.println();
System.out.println("sum of i and j and k of subob is : ");
subob.sum();

	}

}
