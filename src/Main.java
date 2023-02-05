import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

// kalkulators

        int sk1;
        int sk2;
        String darb;

        Scanner ievads1 = new Scanner(System.in);

        System.out.println("Ievadiet pirmo skaitli ");
        sk1 = ievads1.nextInt();

        Scanner darbiba = new Scanner(System.in);

        System.out.println("Ievadiet matemātisko darbību ");
        darb = darbiba.next();

        Scanner ievads2 = new Scanner(System.in);

        System.out.println("Ievadiet otro skaitli ");
        sk2 = ievads2.nextInt();

        if (darb.equals("+")) {
            System.out.println("Atbilde = " + (sk1 + sk2));
        } else if (darb.equals("-")) {
            System.out.println("Atbilde = " + (sk1 - sk2));
        } else if (darb.equals("*")) {
            System.out.println("Atbilde = " + (sk1 * sk2));
        } else if (darb.equals("/")) {
            System.out.println("Atbilde = " + (sk1 / sk2));
        }
    }
}