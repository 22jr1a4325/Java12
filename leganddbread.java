import java.util.Scanner;
interface Area{
    double Carea();
}
interface perimeter{
    double Cperimeter();
}
class Rectangle implements Area,perimeter{
    double length;
    double breadth;
    Rectangle(double length, double breadth){
        this.length= length;
        this.breadth= breadth;
    }
    public double Carea(){
        return length*breadth;
    }
    public double Cperimeter(){
         return 2*(length+breadth);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length : ");
        double length = sc.nextDouble();
        System.out.print("enter the breadth : ");
        double breadth =sc.nextDouble();
        Rectangle r= new Rectangle(length, breadth);
        System.out.println("Area :" + r.Carea());
        System.out.println("Perimeter :" + r.Cperimeter());
        sc.close();
    }
}