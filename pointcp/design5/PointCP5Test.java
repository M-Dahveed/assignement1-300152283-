import java.io.*;

//import design2.PointCP2;
//import design3.PointCP3;

public class PointCP5Test {
    public static void main(String[] args) {
        PointCP5 point1 = new PointCP2('C', 10, 10);
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point1.getRho();
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time elapsed for getRho(CP5(2)): " + (end1 - start1) * 0.001);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point1.getTheta();
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time elapsed for getTheta(CP5(2)): " + (end2 - start2) * 0.001);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point1.getX();
        }
        long end3 = System.currentTimeMillis();
        System.out.println("Time elapsed for getX(CP5(2)): " + (end3 - start3) * 0.001);

        long start4 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point1.getY();
        }
        long end4 = System.currentTimeMillis();
        System.out.println("Time elapsed for getY(CP5(2)): " + (end4 - start4) * 0.001);

        long start5 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point1.getDistance(point1);
        }
        long end5 = System.currentTimeMillis();
        System.out.println("Time elapsed for getDistance(CP5(2)): " + (end5 - start5) * 0.001);

        PointCP5 point2 = new PointCP3('P', 10, 45);
        long start12 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point2.getRho();
        }
        long end12 = System.currentTimeMillis();
        System.out.println("Time elapsed for getRho(CP5(3)): " + (end12 - start12) * 0.001);

        long start22 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point2.getTheta();
        }
        long end22 = System.currentTimeMillis();
        System.out.println("Time elapsed for getTheta(CP5(3)): " + (end22 - start22) * 0.001);

        long start32 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point2.getX();
        }
        long end32 = System.currentTimeMillis();
        System.out.println("Time elapsed for getX(CP5(3)): " + (end32 - start32) * 0.001);

        long start42 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point2.getY();
        }
        long end42 = System.currentTimeMillis();
        System.out.println("Time elapsed for getY(CP5(3)): " + (end42 - start42) * 0.001);

        long start52 = System.currentTimeMillis();
        for (int i = 0; i < 99999999; i++) {
            point2.getDistance(point2);
        }
        long end52 = System.currentTimeMillis();
        System.out.println("Time elapsed for getDistance(CP5(3)): " + (end52 - start52) * 0.001);
    }


    private static PointCP5 getInput() throws IOException {
        byte[] buffer = new byte[1024]; // Buffer to hold byte input
        boolean isOK = false; // Flag set if input correct
        String theInput = ""; // Input information

        // Information to be passed to the constructor
        char coordType = 'A'; // Temporary default, to be set to P or C
        double a = 0.0;
        double b = 0.0;

        // Allow the user to enter the three different arguments
        for (int i = 0; i < 3; i++) {
            while (!(isOK)) {
                isOK = true; // flag set to true assuming input will be valid

                // Prompt the user
                if (i == 0) // First argument - type of coordinates
                {
                    System.out.print("Enter the type of Coordinates you "
                            + "are inputting ((C)artesian / (P)olar): ");
                } else // Second and third arguments
                {
                    System.out.print("Enter the value of "
                            + (coordType == 'C'
                                    ? (i == 1 ? "X " : "Y ")
                                    : (i == 1 ? "Rho " : "Theta "))
                            + "using a decimal point(.): ");
                }

                // Get the user's input

                // Initialize the buffer before we read the input
                for (int k = 0; k < 1024; k++)
                    buffer[k] = '\u0020';

                System.in.read(buffer);
                theInput = new String(buffer).trim();

                // Verify the user's input
                try {
                    if (i == 0) // First argument -- type of coordinates
                    {
                        if (!((theInput.toUpperCase().charAt(0) == 'C')
                                || (theInput.toUpperCase().charAt(0) == 'P'))) {
                            // Invalid input, reset flag so user is prompted again
                            isOK = false;
                        } else {
                            coordType = theInput.toUpperCase().charAt(0);
                        }
                    } else // Second and third arguments
                    {
                        // Convert the input to double values
                        if (i == 1)
                            a = Double.valueOf(theInput).doubleValue();
                        else
                            b = Double.valueOf(theInput).doubleValue();
                    }
                } catch (Exception e) {
                    System.out.println("Incorrect input");
                    isOK = false; // Reset flag as so not to end while loop
                }
            }

            // Reset flag so while loop will prompt for other arguments
            isOK = false;
        }
        // Return a new PointCP object
        return (new PointCP3(coordType, a, b));
    }
}
