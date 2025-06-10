import java.util.Scanner;
class Operation{
    void calculate(int n){
        
        System.out.println("General operation"+n);
    }
}
class Power extends Operation{
    void calculate(int n){
        System.out.println("Square of " + n + "is" +(n*n));
    }
}
class Factorial extends Operation{
    void calculate(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial of "+ n +"is" +fact);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Operation op;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        op = new Power();
        op.calculate(num);
        op = new Factorial();
        op.calculate(num);
    }
}