import java.util.Scanner;

class Demo{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int n2 = s.nextInt();
            System.out.println("number is as you guessed = "+n);
            System.out.println("number is as you guessed = "+n2);
        }
    }
}