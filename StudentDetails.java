import java.util.Scanner;
public class Main
{
    // Encapsulate student class
    static class Student{
        
        private String name;
        private int age;
        private double grade;
        public Student(String name, int age, double grade){
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public double getGrade(){
            return grade;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
        if(age>19){
            this.age = age;
        }
        else{
            System.out.println("Student is underaged  for Graduation grade");
        }
        }
        public void setGrade(double grade){
            if(grade>=0  && grade<=100){
                this.grade = grade;
            }
            else{
                System.out.println("invalid grade");
            }
        }
        public void displayDetails(){
            System.out.println("Student Details : ");
            System.out.println("Name: " +name);
             System.out.println("Age: " +age);
              System.out.println("Grade: " +grade);
        }
}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr the student name : ");
            String name = sc.nextLine();
            System.out.println("Enter the student age : ");
            int age = sc.nextInt();
            System.out.println("Enter the stident grade : ");
            double grade = sc.nextDouble();
            Student student = new Student(name, age, grade);
            student.displayDetails();
            System.out.println("\n updating the student data:");
            System.out.println("Enter new name : ");
            sc.nextLine();
            String newName = sc.nextLine();
            student.setName(newName);
            System.out.println("Enter new age:");
            int newAge= sc.nextInt();
            student.setAge(newAge);
            System.out.println("Enter new grade:");
            double newGrade= sc.nextDouble();
            student.setGrade(newGrade);
            student.displayDetails();
            sc.close();
        }
    }
