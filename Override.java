package chapter8;
class mohsen{
	int i,j;
	mohsen(int a,int b){
		i=a;
		j=b;
	}
	void show_mohsen() {
		System.out.println("i and j :"+i+" "+j);
	}
}
class farzaneh extends mohsen{
	int k;
	farzaneh(int a,int b,int c)
	{
		super(a,b);
		k=c;
		
	}

	void show_mohsen() {
		super.show_mohsen();	
	}
	void show_mohsen(String msg) {
		System.out.println(msg + k);
		
	}
	
}
public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		farzaneh obf=new farzaneh(1,2,3);
		
		obf.show_mohsen("this is k: ");
		obf.show_mohsen();
	}

}
