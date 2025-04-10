import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAM: Entrance
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Entrance {

    private static Scanner sc;

    public Entrance() {
        sc = new Scanner(System.in);
    }

    public void scannerClose() {
        sc.close();
    }

    public static byte valueByte(String message) {

        do {
            String resp = valueString(message);
            try {
                return Byte.parseByte(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static int valueInt(String message) {

        do {
            String resp = valueString(message);
            try {
                return Integer.parseInt(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static float valueFloat(String message) {

        do {
            String resp = valueString(message);
            try {
                return Float.parseFloat(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static double valueDouble(String message) {

        do {
            String resp = valueString(message);
            try {
                return Double.parseDouble(resp);
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    public static char valueChar(String message) {

        do {
            String resp = valueString(message);
            try {
                lenghtChar(resp.length());
                return resp.charAt(0);
            } catch (LengthCharException e) {
                System.out.println("Error: " + e);
            }
        } while (true);
    }

    private static void lenghtChar(int r) throws LengthCharException {

        if (r != 1) {
            throw new LengthCharException();
        }
    }

    public static String valueString(String message) {

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else {
                return resp;
            }
        } while (true);
    }

    public static boolean valueBoolean(String message) throws IllegalArgumentException {

        do {
            char resp = Character.toUpperCase(valueChar(message));
            switch (resp) {
                case 'Y':
                case 'T':
                case 'S':
                    return true;
                case 'F':
                case 'N':
                    return false;
                default:
                    throw new IllegalArgumentException("Error: only valid answers: 'S', 'N', 'Y', 'N', 'T', 'F'.");
            }
        } while (true);
    }

    public static int valueIntNonException(String message) {

        do {
            String resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else if (isNumber(resp)) {
                return Integer.parseInt(resp);
            }
        } while (true);
    }

    public static String readKeystrokesString(String message) {

        System.out.println(message);
        return sc.nextLine();
    }

    public static boolean isNumber(String resp) {

        return (resp.matches("\\d+")) ? true : false;
    }
}
