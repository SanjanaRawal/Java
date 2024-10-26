import java.util.Scanner;

public class greetingMessage {
    public static void main(String[] args) {
        greet();
    }
    static void greet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Have a nice day ahead ! ");
    }
}

