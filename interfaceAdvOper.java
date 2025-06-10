import java.util.Scanner;
interface BasicOperations{  //parent intercae
    void add(int a, int b);
}
interface AdvOperations extends BasicOperations{     //derived interface from parent
    void multiply(int a, int b);
}
class Calculator implements AdvOperations{
    public void add(int a, int b){
        System.out.println("Addition: " + (a+b));
    }
    public void multiply(int a, int b){
        System.out.println("Multiplication: " + (a*b));
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int x= sc.nextInt();
        System.out.println("Enter the value of b : ");
        int y= sc.nextInt();
        System.out.println(" obj defining and accessing ");
        Calculator c= new Calculator();
        c.add(x,y);
        c.multiply(x,y);
        sc.close();
    }
}