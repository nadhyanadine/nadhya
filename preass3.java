
import java.util.Scanner;

public class preass3 {
    public static void main(String[] args) {
        Scanner Nad = new Scanner(System.in);

        String jenisKelamin = Nad.next();
        double beratBadan = Nad.nextDouble();
        double tinggiBadan = Nad.nextDouble();

        double tinggiMeter = tinggiBadan / 100.0;
        double bmi = beratBadan / (tinggiMeter * tinggiMeter);

        String kategori = kategoriBMI(jenisKelamin, bmi);

        System.out.printf("%.2f, %s", bmi, kategori);
    }

    public static String kategoriBMI(String jenisKelamin, double bmi) {
        if (jenisKelamin.equalsIgnoreCase("pria")) {
            if (bmi < 20.50) {
                return "Kurus";
            } else if (bmi >= 20.50 && bmi < 26.99) {
                return "Ideal";
            } else if (bmi >= 27.00) {
                return "Gemuk";
            } else {
                return "Kegemukan";
            }
        } else if (jenisKelamin.equalsIgnoreCase("wanita")) {
            if (bmi < 18.50) {
                return "Kurus";
            } else if (bmi >= 18.50 && bmi < 24.99) {
                return "Ideal";
            } else if (bmi >= 25.00) {
                return "Gemuk";
            } else {
                return "Kegemukan";
            }
        } else {
            return "Jenis kelamin tidak valid";
        }
    }
}
