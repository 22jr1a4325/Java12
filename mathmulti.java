import java.util.Scanner;
interface one{
    int add(int a,int b);
}
interface two{
    int multiply(int a,int b);
}
class three implements one,two{
    public int add(int a,int b){
        return a+b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class mathmulti{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        three obj=new three();
        System.out.println("Enter the first number");
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();
        System.out.println("-----Results-----");
        System.out.println("Addition:"+obj.add(x,y));
        System.out.println("Mutliplication:"+obj.multiply(x,y));
        sc.close();
    }
}

    