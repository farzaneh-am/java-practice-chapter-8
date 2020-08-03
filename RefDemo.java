package chapter8;

public class RefDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vol;
		Boxweight weightBox=new Boxweight(3,5,7,8.37);
		Box planBox=new Box();
		vol=weightBox.volom();
		System.out.println("volom of weightBox is:"+vol);
		System.out.println("weight of weightBox is:"+weightBox.weight);
		System.out.println();
		planBox=weightBox;
		vol=planBox.volom();
		System.out.println("volom of planBox is:"+vol);
		//System.out.println("weight of weightBox is:"+planBox.weight);
		

	}

}
