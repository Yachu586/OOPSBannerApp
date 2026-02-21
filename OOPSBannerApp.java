/**
 * OOPSBannerApp - UC3: Render OOPS as Banner using String.join()
 *
 * <p>This program refactors UC2 by replacing the string concatenation
 * using the '+' operator with the String.join() method. This improves
 * memory efficiency by reducing intermediate String object creation.</p>
 *
 * <p>Drawback of UC2: The '+' operator creates multiple intermediate
 * String objects in memory due to String immutability, leading to
 * memory overhead and performance impact.</p>
 *
 * <p>Key Concepts: String.join() Method, Memory Efficiency,
 * String Immutability, Refactoring Code.</p>
 *
 * @author Yashwanth
 * @version 3.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the Java application.
     * Prints "OOPS" in a banner format using String.join() method
     * with " " (space) as the delimiter for joining character patterns.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Line 1: Top of O, O, P, S
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "******   ", "  *****  "));

        // Line 2: Upper sides
        System.out.println(String.join(" ", " *     * ", " *     * ", "*     *  ", " *       "));

        // Line 3
        System.out.println(String.join(" ", "*       *", "*       *", "*     *  ", " *       "));

        // Line 4: Middle
        System.out.println(String.join(" ", "*       *", "*       *", "******   ", "  *****  "));

        // Line 5
        System.out.println(String.join(" ", "*       *", "*       *", "*        ", "       * "));

        // Line 6: Lower sides
        System.out.println(String.join(" ", " *     * ", " *     * ", "*        ", "       * "));

        // Line 7: Bottom of O, O, P, S
        System.out.println(String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  "));
    }
}
