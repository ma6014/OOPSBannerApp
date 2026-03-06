/**
 * OOPS Banner App
 * UC7 - Store Character Pattern in a Class
 * @author Mugesh Krishna
 * @version 7.0
 */

public class OOPSBannerApp {

    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String getPatternRow(int row) {
            return pattern[row];
        }
    }

    public static String buildBannerRow(int row, CharacterPatternMap[] characters) {
        StringBuilder sb = new StringBuilder();

        for (CharacterPatternMap cp : characters) {
            sb.append(cp.getPatternRow(row)).append("   ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                " ****** ",
                "*     * ",
                "*     * ",
                " ****** ",
                "*        ",
                "*        ",
                "*        "
        });

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                "  *****  ",
                " *     * ",
                " *        ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        });

        CharacterPatternMap[] bannerChars = { O, O, P, S };

        for (int i = 0; i < 7; i++) {
            System.out.println(buildBannerRow(i, bannerChars));
        }
    }
}