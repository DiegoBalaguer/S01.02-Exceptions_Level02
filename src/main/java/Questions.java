
/**
 * PROGRAM: Questions
 * AUTHOR: Diego Balaguer
 * DATE: 07/04/2025
 */

public class Questions {

    Entrance intro;

    public Questions() {
        intro = new Entrance();
    }

    public void ScannerClose() {
        intro.scannerClose();
    }

    public void fingersHandByteQuestion() {
        boolean quit = false;

        do {
            byte qt = intro.valueByte("Type number your fingers hand (o to 10): ");
            try {
                Filters.fingersFilter(qt);
                System.out.println("you have " + qt + " fingers on your hands.");
                quit = true;
            } catch (FingersException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void floorsHotelQuestion() {
        boolean quit = false;

        do {
            int qt = intro.valueInt("Type number floors hotel Miramar (1 to 65): ");
            try {
                Filters.floorsFilter(qt);
                System.out.println("The number floors hotel Miramar is: " + qt + ".");
                quit = true;
            } catch (FloorsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void computersPriceQuestion() {
        boolean quit = false;

        do {
            float qt = intro.valueFloat("Type price office's computers (1 to 6000): ");
            try {
                Filters.computersPrice(qt);
                System.out.println("The price ofrice's computers is: " + qt + "€.");
                quit = true;
            } catch (ComputersPriceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void stockPapersQuestion() {
        boolean quit = false;

        do {
            double qt = intro.valueDouble("Type stock paper's sheets in the office (1 to 100000): ");
            try {
                Filters.sheetsStock(qt);
                System.out.println("The paper's sheets in the office is: " + qt + " sheets.");
                quit = true;
            } catch (SheetsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void insertVocalQuestion() {
        boolean quit = false;

        do {
            char qt = intro.valueChar("Insert one vocal (a to u): ");
            try {
                Filters.vocalsChar(qt);
                System.out.println("The char insert is a vocal: " + qt + ".");
                quit = true;
            } catch (VocalsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void insertPasswrdQuestion() {
        boolean quit = false;

        do {
            String qt = intro.valueString("Insert password (equal or greater than 10 characters): ");
            try {
                Filters.passwdLenght(qt);
                System.out.println("The password is correct.");
                quit = true;
            } catch (PasswdException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

    public void destroyWorld() {

        boolean quit = false;

        do {
            try {
                boolean qt = intro.valueBoolean("Delete world ('S', 'N')?: ");
                if (qt)
                    System.out.println("The world is destroyed.");
                else System.out.println("The world has one more day.");
                quit = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (!quit);
    }

}