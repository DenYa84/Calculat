public class Num {
    static String a;
    static String b;
    static String op;

    public static void numAr() {

        switch (a) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                switch (b) {
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> Operation.Arab ();
                    default -> System.out.println ("Только Римские или только Арабские цифры");
                }

            }
            default -> numRom ();
        }

    }

    public static void numRom() {
        switch (a) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> {
                switch (b) {
                    case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> Operation.Rom ();
                    default -> System.out.println ("Только Римские или только Арабские цифры");

                }

            }
        }
    }
}


