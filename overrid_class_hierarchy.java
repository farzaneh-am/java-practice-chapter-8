package chapter8;
class w{
	int i,j;
	w(int n,int m){
		i=n;;
		j=m;
		
	}
	void show3(){
		System.out.println("i and j : "+i+" , "+j);
	}
}
class q extends w{
	int k;
	q(int n,int m,int v){
		super(n,m);
		k=v;
		
	}
	void show3(){
		super.show3();
		System.out.println("k:"+k);
	}
	

}

public class overrid_class_hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q opk=new q(2,8,9);
		opk.show3();

	}

}
