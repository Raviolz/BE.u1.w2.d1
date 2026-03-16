package Es2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Per sapere quanti km al litro inserisci quanti km hai fatto");
            int km = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci quanti litri hai consumato");
            int litri = Integer.parseInt(scanner.nextLine());

            System.out.println(km / litri);
        } catch (ArithmeticException e) {
            System.out.println("operazione non possibile");
        } catch (NumberFormatException e) {

            System.out.println("Devi inserire un numero");

            ;
        }
    }
}


// Con 5.2 va in errore devi inserire un numero.
// Double.parseDouble() per farlo andare
