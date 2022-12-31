import java.util.Scanner;

public class Greeter {
    public static void main(String[] args)
    { 
        System.out.println("What is your full name? (Please provide your name and press enter)");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello Jenkins " + name +  "!!");

    }
}

