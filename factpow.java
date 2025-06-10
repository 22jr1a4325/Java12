import java.util.Scanner;
class InputNumbers{
    int a,b;
    void getInput(Scanner sc){
        System.out.println("Enetr first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextINt();
    }
}
class PowerCal extends InputNumbers{
    void power(){
        int result =1;
        for(int i=1;i<=b;i++){
            result *= a;
        }
        System.out.println("Power ("+a+"^"+b+"):"+result);
    }
}
class FactorialCal extends PowerCal{
    int factorial(int n){
        int fact=1;
        for(i=1;i<=n;i++){
            
            fact*=i;
            return fact;
        }
        void showFactorial(){
            System.out.println("Factorial of"+ a +": "+factorial(a));
            System.out.println("Factorial of"+ b +": "+factorial(b));
        }
    }
}
    public class factpow{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            FactorialCal obj = new FactorialCal();
            obj.getInput(sc);
            System.out.println();
            obj.power();
            obj.showFactorial();
            sc.close();
        }
    }
