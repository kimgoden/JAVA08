package project09;

public class Vicycle_MAIN {
	public static void main(String[] args) {
		Vicycle v = new Vicycle();
		Information info =  new Vicycle();
		InformationDetail infod = new Vicycle();
		
		v.show(200000, "하이브리드 자전거");
		v.buy(200000, "하이브리드 자전거");
		v.goodsDetail();

       info.show(200000, "하이브리드 자전거");
       info.buy(10000, "하이브리드 자전거");
       
       infod.goodsDetail();
	}
}

