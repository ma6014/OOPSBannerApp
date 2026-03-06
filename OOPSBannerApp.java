/**
 * OOPS Banner App
 * UC6 - Refactor Banner Logic into Functions
 * @author Mugesh Krishna
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            buildLine(0),
            buildLine(1),
            buildLine(2),
            buildLine(3),
            buildLine(4),
            buildLine(5),
            buildLine(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method to assemble full banner row
    public static String buildLine(int row) {
        return String.join("   ",
                getOPattern(row),
                getOPattern(row),
                getPPattern(row),
                getSPattern(row)
        );
    }

    // O Pattern
    public static String getOPattern(int row) {
        String[] O = {
            " *****  ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *****  "
        };
        return O[row];
    }

    // P Pattern
    public static String getPPattern(int row) {
        String[] P = {
            " ****** ",
            "*     * ",
            "*     * ",
            " ****** ",
            "*        ",
            "*        ",
            "*        "
        };
        return P[row];
    }

    // S Pattern
    public static String getSPattern(int row) {
        String[] S = {
            "  *****  ",
            " *     * ",
            " *        ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };
        return S[row];
    }
}