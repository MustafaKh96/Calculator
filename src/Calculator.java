import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void calculator() throws java.util.InputMismatchException {
        int erg = 0;
        Scanner sc = new Scanner(System.in);
        int a ;
        char s;
        int b ;
        while (true){
            System.out.println("Please Enter the first number");
            try {
                a = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The entry is wrong!!");
                System.out.println("Try again");
                sc.next(); // lösche die Eingabe.
                continue;
            }
            break;
        }
        System.out.println("Please Enter the operation");
        s = sc.next().charAt(0);
        while(true) {
            System.out.println("Please Enter the second number");
            try {
                b = sc.nextInt();
            }catch (InputMismatchException e) {
                System.out.println("The entry is wrong!!");
                System.out.println("Try again");
                sc.nextLine(); // lösche die Eingabe.
                continue;
            }
            break;
        }
        if (s == '+') {
            erg = a + b;
            System.out.println("Das Ergebnis ist : " + a + " " + s + " " + b + " = " + erg);
        } else if (s == '-') {
            erg = a - b;
            System.out.println("Das Ergebnis ist : " + a + " " + s + " " + b + " = " + erg);
        } else if (s == '*') {
            erg = a * b;
            System.out.println("Das Ergebnis ist : " + a + " " + s + " " + b + " = " + erg);
        } else if (s == '/') {
            erg = a / b;
            System.out.println("Das Ergebnis ist : " + a + " " + s + " " + b + " = " + erg);
        } else if (s == '%') {
            erg = a % b;
            System.out.println("Das Ergebnis ist : " + a + " " + s + " " + b + " = " + erg);
        } else {
            System.out.println(s + " is not a mathematical Operation");
        }
    }
}