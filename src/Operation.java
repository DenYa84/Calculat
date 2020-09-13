public class Operation {
    static int z;
    public static void Arab() {
        int a = Integer.parseInt (Num.a);
        int b = Integer.parseInt (Num.b);
        String op = Num.op;
        switch (op) {
            case "+" -> z = a + b;
            case "-" -> z = a - b;
            case "*" -> z = a * b;
            default -> z = a/b;
        }
        System.out.println (z);
    }
    public static void Rom() {
        int a;
        int b;
        int zRom;
        String end;
        switch (Num.a) {
            case "I" -> a = 1;
            case "II" -> a = 2;
            case "III" -> a = 3;
            case "IV" -> a = 4;
            case "V" -> a = 5;
            case "VI" -> a = 6;
            case "VII" -> a = 7;
            case "VIII" -> a = 8;
            case "IX" -> a = 9;
            default -> a = 10;
        }
        switch (Num.b) {
            case "I" -> b = 1;
            case "II" -> b = 2;
            case "III" -> b = 3;
            case "IV" -> b = 4;
            case "V" -> b = 5;
            case "VI" -> b = 6;
            case "VII" -> b = 7;
            case "VIII" -> b = 8;
            case "IX" -> b = 9;
            default -> b = 10;
        }
        String op = Num.op;
        switch (op) {
            case "+" -> zRom = a + b;
            case "-" -> zRom = a - b;
            case "*" -> zRom = a * b;
            default -> zRom = a / b;
        }
        if (zRom > 10) {
            while (zRom > 10) {
                zRom = zRom / 10;
            }
        }
        switch (zRom) {
            case 1 -> end = "I";
            case 2 -> end = "II";
            case 3 -> end = "III";
            case 4 -> end = "IV";
            case 5 -> end = "V";
            case 6 -> end = "VI";
            case 7 -> end = "VII";
            case 8 -> end = "VIII";
            case 9 -> end = "IX";
            default -> end = "X";
        }
        System.out.println(end);
    }
}
