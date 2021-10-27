package project09;

class Vicycle implements Information, InformationDetail {

	@Override
	public void goodsDetail() {
		// TODO Auto-generated method stub
		System.out.println("제조사 : 삼성");
		System.out.println("품질 : 양호");
		System.out.println("모델명: abc");
	}

	@Override
	public void show(int price, String name) {
		// TODO Auto-generated method stub
		System.out.println("이 상품 이름은" + name + "이며 가격은" + price + "원 입니다.");
	}

	@Override
	public void buy(int price, String name) {
		// TODO Auto-generated method stub
		System.out.println("이 상품 이름은" + name + "이며" + price + "원에 구매했습니다다.");
	}

}

