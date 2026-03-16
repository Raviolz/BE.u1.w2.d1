package Es3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("Giorgia", 800);
        ContoOnLine c2 = new ContoOnLine("Giorgia Online", 500, 5);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Scegli da quale conto prelevare, 1 conto bancario, 2 conto online");
        int x = Integer.parseInt(scanner.nextLine());

        switch (x) {

            case 1:
                int howMuch;
                do {
                    System.out.println("Di quando vuoi effettuare il prelievo? Scrivi 0 per uscire." +
                            "La tua disponibilita' e' di:" + c1.getSaldo());
                    howMuch = Integer.parseInt(scanner.nextLine());

                    if (howMuch != 0) {
                        try {
                            c1.preleva(howMuch);
                            System.out.println("Saldo post prelievo " + c1.getSaldo());
                        } catch (BancaException e) {
                            System.out.println(c1.getSaldo() + "Prelievo troppo alto rispetto disponiobilita'");
                            System.out.println(e.getMessage());

                            ;
                        }
                    }
                } while (howMuch != 0);
                break;

            case 2:
                int howMuch2;
                do {
                    System.out.println("Di quando vuoi effettuare il prelievo? Scrivi 0 per uscire");
                    howMuch2 = Integer.parseInt(scanner.nextLine());

                    if (howMuch2 != 0) {
                        try {
                            c2.preleva(howMuch2);
                        } catch (BancaException e) {
                            System.out.println(e.getMessage())
                            ;
                        }
                    }
                } while (howMuch2 != 0);
                break;
            default:
                System.out.println("Conto non esistente");
        }

    }
}

