class Operation  {

    public static void Arab() {
        double z = 0;
        int a = Integer.parseInt (Num.a);
        double b = Double.parseDouble (Num.b);
        String op = Num.op;
        switch (op) {
            case "+" -> z = a + b;
            case "-" -> z = a - b;
            case "*" -> z = a * b;
            case "/" -> z = a / b;
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
            case "X" -> a = 10;
            default -> throw new IllegalStateException ("Unexpected value: " + Num.a);
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
            case "X" -> b = 10;
            default -> throw new IllegalStateException ("Unexpected value: " + Num.b);
        }
        String op = Num.op;
        switch (op) {
            case "+" -> zRom = a + b;
            case "-" -> zRom = a - b;
            case "*" -> zRom = a * b;
            default -> zRom = a / b;
        }
            String end1;
            while (zRom > 10) {
             int zRom1 = zRom / 10;
             int zRom2 = zRom % 10;
            switch (zRom1) {
                case 1 -> end1 = "X";
                case 2 -> end1 = "XX";
                case 3 -> end1 = "XXX";
                case 4 -> end1 = "XL";
                case 5 -> end1 = "L";
                case 6 -> end1 = "LX";
                case 7 -> end1 = "LXX";
                case 8 -> end1 = "LXXX";
                case 9 -> end1 = "XC";
                case 10 -> end1 = "C";
                default -> throw new IllegalStateException ("Десятки value: " + zRom1);
            }
            String end2;
            switch (zRom2) {
                case 1 -> end2 = "I";
                case 2 -> end2 = "II";
                case 3 -> end2 = "III";
                case 4 -> end2 = "IV";
                case 5 -> end2 = "V";
                case 6 -> end2 = "VI";
                case 7 -> end2 = "VII";
                case 8 -> end2 = "VIII";
                case 9 -> end2 = "IX";
                default -> end2 = "";
            }if (zRom2 > 0){
                System.out.println (end1 + end2);
            }else {
                System.out.println (end1);
            }
            break;
            }
            if (zRom <= 10) {
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
                    case 10 -> end = "X";
                    default -> throw new IllegalStateException ("<10 value: " + zRom);
                }
                System.out.println (end);
            }
    }
}
