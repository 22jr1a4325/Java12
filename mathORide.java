import java.util.Scanner;
//parent class
class Calc{
    int a,b;
    void setValues(int a, int b){
        this.a=a;
        this.b=b;
    }
    void calculate(){
        int sum= a+b;
        System.out.println("Sum from parent:"+ sum);
    }
 }
 class Extraop extends Calc{
     @Override
     void calculate(){
         int multiply= a*b;
         System.out.println("Multiply from child:"+ multiply);
        }
    }
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number: ");
         int x = sc.nextInt();
         System.out.println("Enter second number: ");
         int y = sc.nextInt();
         Calc c = new Calc();
         c.setValues(x,y);
         c.calculate();//calls parents version of output
         Extraop e = new Extraop();
         e.setValues(x,y);
         e.calculate();
        }
    }