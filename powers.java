public class Main{
    public static void main(String[] args){
        int base = 2;
        int exponentLimit = 10;
        System.out.println("powersof "+base+ ":");
        for(int i=0;i<=exponentLimit;i++){
            System.out.println(base + "^" + i + " = " + (int)Math.pow(base, i));
        }
    }
}