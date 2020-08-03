package chapter8;
class A1{
	int i;
	private int j;
	void setij(int x,int y) {
		i=x;
		j=y;
	}
}
class B1 extends A1{
	int total;
	void sum() {
		total=i+j;	//Error because j is private in A1 and It is not accessible for B1
	}
}
public class Access_private_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		B1 subob=new B1();
		subob.setij(9,10);
		subob.sum();
		System.out.println("total is : "+subob.total);
		
	}

}
