import java.util.Scanner;
@FunctionalInterface
interface Hi{
    void sayHello(String name);
}
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        Hi greeting = (n) -> System.out.println("Hello, " + n + " Good morning");
        
        greeting.sayHello(name);
        sc.close();
    }
}