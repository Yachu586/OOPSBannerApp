/**
 * OOPSBannerApp - UC2: Render OOPS as Banner using Print Statements
 *
 * <p>This program extends UC1 by displaying "OOPS" in a large banner
 * format made from spaces and '*' characters using individual print
 * statements for each line.</p>
 *
 * <p>Each character (O, O, P, S) is represented in a 7-line format
 * with a width of 9 characters, aligned properly using string
 * concatenation (+) operator.</p>
 *
 * <p>Key Concepts: ASCII Art, String Manipulation, Operator Overloading,
 * Multiple Print Statements.</p>
 *
 * @author Yashwanth
 * @version 2.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the Java application.
     * Prints "OOPS" in a banner format using '*' and ' ' characters.
     * Each letter is 9 characters wide and 7 lines tall.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Line 1: Top of O, O, P, S
        System.out.println("  *****  " + " " + "  *****  " + " " + "******   " + " " + "  *****  ");

        // Line 2: Upper sides
        System.out.println(" *     * " + " " + " *     * " + " " + "*     *  " + " " + " *       ");

        // Line 3
        System.out.println("*       *" + " " + "*       *" + " " + "*     *  " + " " + " *       ");

        // Line 4: Middle
        System.out.println("*       *" + " " + "*       *" + " " + "******   " + " " + "  *****  ");

        // Line 5
        System.out.println("*       *" + " " + "*       *" + " " + "*        " + " " + "       * ");

        // Line 6: Lower sides
        System.out.println(" *     * " + " " + " *     * " + " " + "*        " + " " + "       * ");

        // Line 7: Bottom of O, O, P, S
        System.out.println("  *****  " + " " + "  *****  " + " " + "*        " + " " + "  *****  ");
    }
}
