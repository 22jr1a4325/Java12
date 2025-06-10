import java.util.Scanner;
class Person{
    protected String name;
    protected void setName(String name){
        this.name= name;
    }
    protected void displayName(){
        System.out.println("Name: "+ name);
    }
}
class Boy extends Person{
    protected float height;
    protected void setHeight(float height){
        
        this.height= height;
    }
    public void displayDetails(){
        displayName();
        System.out.println("height: "+ height);
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Boy b = new Boy();
        System.out.print("Enter the name :");
        String nameInput= sc.nextLine();
        b.setName(nameInput);
        System.out.print("Enter height :");
        float height=sc.nextFloat();
        b.setHeight(height);
        System.out.println("\n----person details------");
        b.displayDetails();
    }
}