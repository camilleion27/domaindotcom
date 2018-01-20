import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Doki Doki Experience");
        System.out.println("\nWhat is your name? (Letters Only Please)");

        String userName = input.nextLine();

        System.out.println("Is your name " + userName + " ?");
        System.out.println("Yes or No?");

        String confirmName = input.nextLine();

        confirmName = confirmName.toLowerCase();

        if (confirmName)

    }
}
