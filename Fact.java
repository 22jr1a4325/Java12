import java.util.Scanner;

// Parent class for factorial
class Fact {
    int number;

    void getNumber(int num) {
        number = num;
    }

    int calculate() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }
}

// Child class for exponential, extends Fact
class Expo extends Fact {
    int base, exponent;

    void getExponentialInput(int b, int e) {
        base = b;
        exponent = e;
    }

    @Override
    int calculate() {
        int power = 1;
        for (int i = 1; i <= exponent; i++) {
            power *= base;
        }
        return power;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Factorial calculation using Fact class
        System.out.print("Enter num for factorial: ");
        int num = sc.nextInt();
        Fact factObj = new Fact();
        factObj.getNumber(num);
        int factorial = factObj.calculate();
        System.out.println("Factorial: " + factorial);

        // Exponential calculation using Expo class
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exp: ");
        int exp = sc.nextInt();
        Expo expoObj = new Expo();
        expoObj.getExponentialInput(base, exp);
        int result = expoObj.calculate();
        System.out.println("Exponential (power): " + result);

        sc.close();
    }
}