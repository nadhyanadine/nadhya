import java.util.Scanner;

public class preass2 {
    public static void main(String[] args) {
        Scanner Nad = new Scanner(System.in);

        int A = Nad.nextInt();
        int B = Nad.nextInt();

        int hasilPenjumlahan = A + B;

        String kalimat = terjemahkanKeKalimat(hasilPenjumlahan);

        System.out.println(kalimat);
    }

    public static String terjemahkanKeKalimat(int angka) {
        String[] satuan = { "nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan" };
        String kalimat = "";

        int ratusan = angka / 100;
        int puluhan = (angka % 100) / 10;
        int satuanAngka = angka % 10;

        if (ratusan > 0) {
            kalimat += satuan[ratusan] + " ratus ";
        }

        if (puluhan > 1) {
            kalimat += satuan[puluhan] + " puluh ";
            if (satuanAngka > 0) {
                kalimat += satuan[satuanAngka];
            }
        } else if (puluhan == 1) {
            kalimat += "sepuluh";
        } else {
            if (satuanAngka > 0) {
                kalimat += satuan[satuanAngka];
            }
        }

        return kalimat;
    }
}
