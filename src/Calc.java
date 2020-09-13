import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine ();
        Scanner scanner = new Scanner (str);

        try {
            Num.a = ( scanner.next () );
            Num.op = ( scanner.next () );
            Num.b = ( scanner.next () );

        } catch (java.util.NoSuchElementException e) {
            System.out.println ("Пример \n 5 - 7");
        }
        switch  (Num.a){
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "I", "II", "III", "IV", "V","VI", "VII", "VIII","IX","X":
                break;
            default:
                System.out.println ("num1 - ERROR");
                break;
        }
        switch (Num.b){
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "I", "II", "III", "IV", "V","VI", "VII", "VIII","IX","X":
                break;
            default:
                System.out.println ("num2 - ERROR");
                break;
        }
        switch (Num.op){
            case "+", "-", "*", "/":
                break;
            default:
                System.out.println ("operator - ERROR");
                break;
        }
        Num.numAr ();
    }
}
