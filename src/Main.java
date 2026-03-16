import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbArr = new int[5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            numbArr[i] = random.nextInt(1, 11);
        }

        System.out.println(Arrays.toString(numbArr));

        System.out.println("Scegli da 1 a 5 la posizione da modificare (0 per uscire)");
        int position = Integer.parseInt(scanner.nextLine());

        while (position != 0) {

            System.out.println("Scegli un numero da inserire");
            int numbToSwitch = Integer.parseInt(scanner.nextLine());

            numbArr[position - 1] = numbToSwitch;

            System.out.println(Arrays.toString(numbArr));

            System.out.println("Scegli da 1 a 5 la posizione da modificare (0 per uscire)");
            position = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Programma terminato");
    }
}


