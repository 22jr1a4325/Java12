import java.util.Scanner;
interface MathOperation{
    int operate(int a, int b);
}
class Addition implements MathOperation{
    public int operate(int a, int b){
        return a+b;
    }
} 
class Multiplication implements MathOperation{
    public int operate(int a, int b){
        return a*b;
    }
}
class Calculator{
    
    private MathOperation operation;
    public Calculator(MathOperation operation){
        this.operation=operation;
    }
    public void calculateAndDisplay(int a, int b){
        
        int result= operation.operate(a,b);
        System.out.println("Result: "+ result);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Choose operation: 1. Add, 2.Multiply");
        
        int choice = sc.nextInt();
        MathOperation operation;
        if(choice==1){
            operation= new Addition();
        }
        else{
            operation= new Multiplication();
        }
        Calculator c = new Calculator(operation);
        c.calculateAndDisplay(num1,num2);
    }
}