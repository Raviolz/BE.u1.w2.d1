package Es1;

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

//        System.out.println("Scegli da 1 a 5 la posizione da selezionare nell array, 0 per terminare");
//        int position = Integer.parseInt(scanner.nextLine());
//
//        while (position != 0) {
//
//            try {
//
//                System.out.println("Scegli un numero da inserire");
//                int numbToSwitch = Integer.parseInt(scanner.nextLine());
//
//                numbArr[position - 1] = numbToSwitch;
//
//                System.out.println(Arrays.toString(numbArr));
//
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Posizione non valida");
//            }
//
//            System.out.println("Scegli da 1 a 5 la posizione da selezionare nell array, 0 per terminare");
//            position = Integer.parseInt(scanner.nextLine());
//        }

        // COSI TI DICE CHE NON VA BENE SOLO DOPO AVER MESSO IL NUMERO ANCHE SE SA GIA CHE LA POSZIONE E' SBAGLIATA


        while (true) {


            try {
                System.out.println("Scegli da 1 a 5 la posizione da selezionare nell'array, 0 per terminare");
                int position = Integer.parseInt(scanner.nextLine());

                if (position == 0) {
                    break;
                }
                int test = numbArr[position - 1]; // controllo prima di usarlo in modo da andare subito nel catch senza chiedere altro // SI BLOCCA GIA QUI SE OUT

                System.out.println("Scegli un numero da inserire");
                int numbToSwitch = Integer.parseInt(scanner.nextLine());

                numbArr[position - 1] = numbToSwitch;
                System.out.println(Arrays.toString(numbArr));

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posizione non valida, riprova");
            } catch (NumberFormatException e) {

                System.out.println("Devi inserire un numero");

            }
        }

        System.out.println("Programma terminato");
    }
}
