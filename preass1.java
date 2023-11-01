import java.util.Scanner;

public class preass1 {
    public static void main(String[] args) {
        Scanner Nad = new Scanner(System.in);

        int bilangan1 = Nad.nextInt();
        int bilangan2 = Nad.nextInt();
        int bilangan3 = Nad.nextInt();

        int enkripsi1 = enkripsi(bilangan1);
        int enkripsi2 = enkripsi(bilangan2);
        int enkripsi3 = enkripsi(bilangan3);

        System.out.println(enkripsi1);
        System.out.println(enkripsi2);
        System.out.println(enkripsi3);
    }

    public static int enkripsi(int bilangan) {
        int satuan = (bilangan % 10 + 5) % 10;
        int puluhan = ((bilangan / 10) % 10 + 5) % 10;
        int ratusan = ((bilangan / 100) % 10 + 5) % 10;
        int ribuan = ((bilangan / 1000) + 5) % 10;

        int hasilEnkripsi = ribuan * 1000 + puluhan * 100 + satuan * 10 + ratusan;

        return hasilEnkripsi;
    }
}
