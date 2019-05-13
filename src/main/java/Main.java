import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter e-mail: ");
        String email = in.nextLine();
        System.out.print("Enter password: ");
        String password = in.nextLine();

        Validator validator = new Validator();
        System.out.println("\nYour e-mail validation test is: " + Validator.isEmailValid(email));
        System.out.println("Your password validation test is: " + validator.isPasswordValid(password));

    }
}
