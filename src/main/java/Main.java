import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter e-mail: ");
        String email = in.nextLine();
        System.out.print("Enter password: ");
        String psswrd = in.nextLine();

        Validator validator = new Validator();
        System.out.println("\nYour e-mail validation test is: " + validator.isEmailValid(email));
        System.out.println("Your password: " + psswrd);


    }
}
