class MathOperations{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class Main{
    public static void main(String[] args){
        MathOperations mo = new MathOperations();
        System.out.println(mo.add(10, 20));
        System.out.println(mo.add(2.4, 3.4));
        System.out.println(mo.add(4, 5, 6));
        
    }
}