package chapter8;
class far{
	int i;
}
class far2 extends far{
	int i;
	far2(int a,int b){
		super.i=a;
		i=b;
		
	}
	void show() {
		System.out.println("i in superclass:"+super.i);
		System.out.println("i in subclass:"+i);
	}
}
public class useSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		far2 ob=new far2(2,8);
		ob.show();

	}

}
