
/**
 * PROGRAM: Main
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Main {

    public static void main(String[] args) {

        process();

    }

    public static void process() {

        Questions q = new Questions();

        q.fingersHandByteQuestion();
        q.floorsHotelQuestion();
        q.computersPriceQuestion();
        q.stockPapersQuestion();
        q.insertVocalQuestion();
        q.insertPasswrdQuestion();
        q.destroyWorld();

        q.ScannerClose();

        System.out.println("Bye....");
    }
}
