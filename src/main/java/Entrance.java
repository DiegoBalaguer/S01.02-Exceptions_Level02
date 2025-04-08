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
        boolean quit = false;
        String resp = "";
        byte answer = 0;
        do {
            resp = valueString(message);
            try {
                answer = Byte.parseByte(resp);
                quit = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (!quit);
        return answer;
    }

    public static int valueInt(String message) {
        boolean quit = false;
        String resp = "";
        int answer = 0;
        do {
            resp = valueString(message);
            try {
                answer = Integer.parseInt(resp);
                quit = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (!quit);
        return answer;
    }

    public static float valueFloat(String message) {
        boolean quit = false;
        String resp = "";
        float answer = 0;
        do {
            resp = valueString(message);
            try {
                answer = Float.parseFloat(resp);
                quit = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (!quit);
        return answer;
    }

    public static double valueDouble(String message) {
        boolean quit = false;
        String resp = "";
        double answer = 0;
        do {
            resp = valueString(message);
            try {
                answer = Double.parseDouble(resp);
                quit = true;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        } while (!quit);
        return answer;
    }

    public static char valueChar(String message) {
        boolean quit = false;
        String resp = "";
        char answer = ' ';

        do {
            resp = valueString(message);
            try {
                lenghtChar(resp.length());
                answer = resp.charAt(0);
                quit = true;
            } catch (LengthCharException e) {
                System.out.println("Error: " + e);
            }
        } while (!quit);
        return answer;
    }

    private static void lenghtChar(int r) throws LengthCharException {

        if (r != 1) {
            throw new LengthCharException();
        }
    }

    public static String valueString(String message) {
        boolean quit = false;
        String resp = "";
        do {
            resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else {
                quit = true;
            }
        } while (!quit);
        return resp;
    }

    public static boolean valueBoolean(String message) throws IllegalArgumentException {
        boolean quit = false;
        char resp = ' ';
        do {
            resp = Character.toUpperCase(valueChar(message));
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
        } while (!quit);
    }

    public static int valueIntNonException(String message) {
        boolean quit = false;
        String resp = "";
        do {
            resp = readKeystrokesString(message);
            if (resp.isBlank()) {
                System.out.println("Empty inputs are wrong.");
            } else if (isNumber(resp)) {
                quit = true;
            }
        } while (!quit);

        return Integer.parseInt(resp);
    }

    public static String readKeystrokesString(String message) {
        System.out.println(message);
        String resp = sc.nextLine();

        return resp;
    }

    public static boolean isNumber(String resp) {
        if (resp.matches("\\d+")) {
            // If it is a number, exit the program.
            return true;
        }

        return false;
    }
}
