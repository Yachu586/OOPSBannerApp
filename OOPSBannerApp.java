/**
 * OOPS Banner App - UC4: Render OOPS as Banner using String Array and Loop
 *
 * Goal: Store all banner lines in a String array and use a loop to print them,
 *       improving modularity and reusability over UC3's individual print statements.
 *
 * Key Concepts:
 *   - String Array (1D) to store banner lines
 *   - String.join() to construct each line from character segments
 *   - Enhanced for-each loop for clean iteration
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create a String array to hold 7 banner lines
        String[] bannerLines = new String[7];

        // Step 2: Populate each line using String.join()
        // Each character (O, O, P, S) is 7 lines tall, ~9 characters wide

        bannerLines[0] = String.join("  ", " *****  ", " *****  ", "******  ", " ***** ");
        bannerLines[1] = String.join("  ", "*     * ", "*     * ", "*     * ", "*     *");
        bannerLines[2] = String.join("  ", "*     * ", "*     * ", "*     * ", "*      ");
        bannerLines[3] = String.join("  ", "*     * ", "*     * ", "******  ", " ***** ");
        bannerLines[4] = String.join("  ", "*     * ", "*     * ", "*       ", "      *");
        bannerLines[5] = String.join("  ", "*     * ", "*     * ", "*       ", "*     *");
        bannerLines[6] = String.join("  ", " *****  ", " *****  ", "*       ", " ***** ");

        // Step 3: Use enhanced for-each loop to print each banner line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}