package project09;

public class newPrintermain {
public static void main(String[] args) {
    String doc = "�ڹ� ����";
    SamPrint sam = new SamPrint();
    sam.print(doc);
    sam.printCMYK(doc);
    
   hellgPrint lg = new hellgPrint();
   lg.print(doc);

}
}
