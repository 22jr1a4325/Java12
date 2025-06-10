import java.util.Scanner;
class DotMatrixPrinter{
   public void print(String content){
        System.out.println("Printing with dot matrix" +content);
   }
    
}
class PrintManager{
    DotMatrixPrinter printer = new DotMatrixPrinter();
    public void printDocument(String content){
        printer.print(content);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Document content : ");
        String doc = sc.nextLine();
        PrintManager manager = new PrintManager();
        manager.printDocument(doc);
        sc.close();
    }
}