import java.util.Scanner;
interface Shape{
    double area();
    double perimeter();
    
}
//implements interface shape in class called rectangle
class Rectangle implements Shape{
    double length;
    double breadth;
    Rectangle(double l, double b){
        length=l;
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(1ength+breadth);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length : ");
        double length = sc.nextDouble();
        System.out.print("enter the breadth : ");
        double breadth =sc.nextDouble();
        Shape r= new Rectangle(length, breadth);
        System.out.println("Area :" + r.area());
        System.out.println("Perimeter :" + r.perimeter());
        sc.close();
    }
}