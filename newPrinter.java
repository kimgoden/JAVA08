package project09;

public interface newPrinter {
	void print(String doc);

}
interface ColorPrintable extends newPrinter{
	void printCMYK(String doc);
}
class SamPrint implements ColorPrintable{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("ªÔº∫ «¡∏∞≈Õ");
		System.out.println(doc + "∏¶ ¿Œº‚«’¥œ¥Ÿ.");
	}

	@Override
	public void printCMYK(String doc) {
		// TODO Auto-generated method stub
		System.out.println("ªÔº∫ «¡∏∞≈Õ");
		System.out.println("ƒ√∑Ø" + doc + "∏¶ ¿Œº‚«’¥œ¥Ÿ.");
	}
	
}
class hellgPrint implements newPrinter{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("ø§¡„ «¡∏∞≈Õ");
		System.out.println(doc + "∏¶ ¿Œº‚«’¥œ¥Ÿ.");
	}
	
}
	
