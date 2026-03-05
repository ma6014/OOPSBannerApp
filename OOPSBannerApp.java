//**
 * OOPS Banner App
 * UC4 - Print OOPS Banner with help of arrays
 * @author Mugesh Krishna
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = String.join("   ", " *****  ", " *****  ", " ****** ", "  ***** ");
        banner[1] = String.join("   ", "*     * ", "*     * ", "*     * ", " *     * ");
        banner[2] = String.join("   ", "*     * ", "*     * ", "*     * ", " *     ");
        banner[3] = String.join("   ", "*     * ", " *****  ", " ****** ", " *****  ");
        banner[4] = String.join("   ", "*     * ", "*       ", "*       ", "      * ");
        banner[5] = String.join("   ", "*     * ", "*       ", "*       ", "*     * ");
        banner[6] = String.join("   ", " *****  ", "* ",       "*       ", " *****  ");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}