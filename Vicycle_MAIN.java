package project09;

public class Vicycle_MAIN {
	public static void main(String[] args) {
		Vicycle v = new Vicycle();
		Information info =  new Vicycle();
		InformationDetail infod = new Vicycle();
		
		v.show(200000, "���̺긮�� ������");
		v.buy(200000, "���̺긮�� ������");
		v.goodsDetail();

       info.show(200000, "���̺긮�� ������");
       info.buy(10000, "���̺긮�� ������");
       
       infod.goodsDetail();
	}
}

