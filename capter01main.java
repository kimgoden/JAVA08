package project09;

public class capter01main extends capter01 {
	public int add(int a, int b) {
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double ave(int[] a) {
		double sum =0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length;
	}
	public static void main(String[] args) {
		capter01 c =  new capter01main();
		System.out.println(c.add(2, 3));
		System.out.println(c.sub(2, 3));
		System.out.println(c.ave(new int[] {1,2,3,4,5}));
	}

}
