import java.util.Scanner;
class Arthmetic{
    void perform() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtract: "+ (a-b));
        System.out.println("Product: "+ (a*b));
        System.out.println("Division: "+ (a/b));
    }
}
public class ao{
    public static void main(String[] args){
        Arthmetic obj = new Arthmetic();
        obj.perform();
    }
}