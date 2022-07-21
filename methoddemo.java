
public class methoddemo {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}

	public static void main(String[] args) {
		methoddemo b=new methoddemo();
		int ans= b.multipynumbers(8,7);
		System.out.println("Multipilcation is :"+ans);
	}
}
