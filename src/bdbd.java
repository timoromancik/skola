import java.util.Scanner;

public class bdbd {
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("napis text a stlac enter: ");
        String out = scanner.next();

        System.out.println("vystup z klavesnice: " + out);
        //int celkovypocet = pocetsamohlasok (out);
        //private static int pocetsamohlasok(String out)
        int pocet = 0;
        int celkovypocet =0;
        for (int i=0; i<out.length();i++)
        switch (out) {
            case "a":
                System.out.println("a");
                break;
            case "e":
                System.out.println("e");
                break;
            case "i":
                System.out.println("i");
                break;
            case "o":
                System.out.println("o");
                break;
            case "u":
                System.out.println("u");
                break;

        }

    }

}
