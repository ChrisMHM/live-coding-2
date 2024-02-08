import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mangos = Integer.valueOf(scanner.nextLine());
        int naranjas = Integer.valueOf(scanner.nextLine());
        MangosNaranjas mangosNaranjas = new MangosNaranjas(mangos, naranjas);
        mangosNaranjas.imprimir();
        scanner.close();
    }
}