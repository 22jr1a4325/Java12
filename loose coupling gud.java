//loose coupling
import java.util.Scanner;
//using abstraction interface
interface Printer{
    void print(String Content);
}
//a concrete class for implementation
class LaserPrinter implements Printer{
    public void print(String content){
        System.out.println("Laser Printer Output " + content);
    }
}
//another concrete class for implementation
class InkjetPrinter implements Printer{
    public void print(String content){
        System.out.println("Inkjet Printer Output " + content);
    }
}
// manager using interface(abstraction)
class PrintManager{
    Printer printer;
    public PrintManager(Printer printer){
        this.printer = printer;
    }
    public void printDocument(String content){
        printer.print(content);
    }
}
public class Main
{
  public static void main(String[] args)
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a document : ");
   String doc = sc.nextLine();
   System.out.println("Choose printer(1. Laser, 2. inkjet");
   int choice = sc.nextInt();
   Printer printer;
   if(choice==1)
   {
    
    printer= new LaserPrinter();
  }
   else
   {
    printer = new InkjetPrinter();
    PrintManager manager = new PrintManager(printer);
    manager.printDocument(doc);
    sc.close();
   }
  }
}