import java.util.Scanner;
class Superfactorial{
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            
            fact*=i;
        }
        return fact;
    }
    long clacfact(int n){
        long sf = 1;
        for(int i=1;i<=n;i++){
            sf *= factorial(i);
        }
        return sf;
    }
}
public class superfact{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Superfactorial obj = new Superfactorial();
        System.out.print("Enetr a number: ");
        int num = sc.nextInt();
        long result = obj.clacfact(num);
        System.out.println("super factorial of" + num + "is" + result);
        sc.close();
    }
}