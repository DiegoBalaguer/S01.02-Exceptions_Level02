
/**
 * PROGRAM: Filters
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Filters {

    public static void fingersFilter(byte r) throws FingersException {

        if (!(r >= 0 && r <= 10)) {
            throw new FingersException("Enter the fingers between 0 and 10.");
        }
    }

    public static void floorsFilter(int r) throws FloorsException {

        if (!(r > 0 && r <= 65)) {
            throw new FloorsException("Enter the floors between 1 and 65.");
        }
    }

    public static void computersPrice(float r) throws ComputersPriceException {

        if (!(r > 0 && r <= 6000)) {
            throw new ComputersPriceException("Enter the price computer between 1 and 6000€.");
        }
    }

    public static void sheetsStock(double r) throws SheetsException {

        if (!(r > 0 && r <= 100000)) {
            throw new SheetsException("Enter the stock sheets between 1 and 100000.");
        }
    }

    public static void vocalsChar(char r) throws VocalsException {

        if (!isVocal(r)) {
            throw new VocalsException();
        }
    }

    public static void passwdLenght(String r) throws PasswdException {

        if (r.length() < 10) {
            throw new PasswdException();
        }
    }

    public static boolean isVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
