import java.util.Scanner;
class Pet
{
    String name;
    public void sound()
    {
        System.out.println("Animal Sounds Only!!!");
    }
}
class Dog extends Pet
{
    @Override // override sound() method
    public void sound()
    
    {
        System.out.println(name +" says : woof");
    }
}
  public class Main{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          Dog myDog = new Dog();
          System.out.println("Enter dogs name: ");
          myDog.name=sc.nextLine();
          System.out.println("\n calling sound....");
          myDog.sound();
        }
    }
