import java.util.Scanner;

public class MessageManager {
    public static Scanner scanner = new Scanner(System.in);
    public static String getUserPin() {
        System.out.println("Input you PIN: ");
        return scanner.next();
    }

    public static void showWelcome(char id) {
        System.out.println(new StringBuilder("Welcome! ").append(id));
    }
    public static void maximumLengthExceeded() {
        System.out.println("The PIN you entered has exceeded the maximum length");
    }
    public static void lengthTooShort() {
        System.out.println("The PIN you entered is too short!");
    }
    public static void loginSuccess(int[] id) {
        System.out.print("Welcome, ");
        printID(id);
        System.out.println("\nYou are in the " + LoginVerification.serverLevel);
        System.out.println("Your access is limited to " + LoginVerification.userLevel + " level");
    }
    public static void printID(int[] id) {
        for(int i = 0; i < id.length; i++) {
            System.out.println(id[i]);
        }
    }
}
