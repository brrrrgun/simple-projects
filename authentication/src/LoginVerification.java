import enums.ServerLevel;
import enums.UserLevel;

import java.util.Scanner;

public class LoginVerification {
    public static Scanner scanner = new Scanner(System.in);
    public static UserLevel userLevel = UserLevel.USER;
    public static ServerLevel serverLevel = ServerLevel.FIRST_SERVER;

    public static void getUserPIN(int[] id) {
        getUserInfo(id);
        int savedPIN = 9821;
        System.out.println("Please enter PIN code");
        int enteredPIN = scanner.nextInt();
        int enteredLength = String.valueOf(enteredPIN).length();
        if (enteredLength >= 5) {
            System.out.println("PIN code entered exceeded the max length");
        } else if (enteredLength <= 3) {
            System.out.println("PIN code entered is too short");
        } else if (enteredLength == 4) {
            if (enteredPIN == savedPIN) {
                System.out.print("Welcome, ");
                printID(id);
                System.out.println("\nYou are in the " + serverLevel);
                System.out.println("Your access is limited to " + userLevel + " level");
            } else {
                System.out.println("Invalid PIN");
            }
        }

    }

    public static void printID(int[] array) {
        for (int i = 2; i < array.length; i++)
            System.out.print(array[i]);
    }

    public static void getUserInfo(int[] providedID) {
        for (int i = 0; i < providedID.length; i++) {
            if (providedID[0] == 1) { //Server 1
                serverLevel = ServerLevel.FIRST_SERVER;
                getUserLevel(providedID);
            } else if (providedID[0] == 2) { //Server 2
                serverLevel = ServerLevel.SECOND_SERVER;
                getUserLevel(providedID);
            } else if (providedID[0] == 3) { //Server 3
                serverLevel = ServerLevel.THIRD_SERVER;
                getUserLevel(providedID);
            }
        }
    }

    public static void getUserLevel(int[] providedID) {
        for (int i = 0; i < providedID.length; i++) {
            if (providedID[1] == 0) {
                userLevel = UserLevel.DEV;
            } else if (providedID[1] == 1) {
                userLevel = UserLevel.ADMIN;
            } else if (providedID[1] == 2) {
                userLevel = UserLevel.USER;
            }
        }
    }

}
