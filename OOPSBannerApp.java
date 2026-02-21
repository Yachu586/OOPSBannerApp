/**
 * OOPSBannerApp - UC5: Render OOPS as Banner using Inline Array Initialization
 *
 * <p>This program refactors UC4 by combining array declaration and
 * initialization with String.join() method calls in a single statement,
 * eliminating the need for separate population statements.</p>
 *
 * <p>Drawback of UC4: Separate statements were needed to declare the
 * array and then populate each element individually, making the code
 * verbose and less concise.</p>
 *
 * <p>Key Concepts: Array Initialization, Inline Initialization,
 * Method Invocation in Initializers, Enhanced For Loop.</p>
 *
 * @author Yashwanth
 * @version 5.0
 */
public class OOPSBannerApp {

    /**
     * Main method - Entry point of the Java application.
     * Declares and initializes a String array inline with
     * String.join() calls, then uses a for-each loop to print
     * the "OOPS" banner.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        // Step 1: Declare and initialize the String array inline
        // using array literal syntax {} with String.join() for each line
        String[] bannerLines = {
            String.join(" ", "  *****  ", "  *****  ", "******   ", "  *****  "),
            String.join(" ", " *     * ", " *     * ", "*     *  ", " *       "),
            String.join(" ", "*       *", "*       *", "*     *  ", " *       "),
            String.join(" ", "*       *", "*       *", "******   ", "  *****  "),
            String.join(" ", "*       *", "*       *", "*        ", "       * "),
            String.join(" ", " *     * ", " *     * ", "*        ", "       * "),
            String.join(" ", "  *****  ", "  *****  ", "*        ", "  *****  ")
        };

        // Step 2: Use enhanced for-each loop to print each line of the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
