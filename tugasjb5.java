import java.util.Scanner;

public class tugasjb5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka tersebut adalah Genap");
        } else {
            System.out.println("Angka tersebut adalah Ganjil");
        }

        sc.close();
    }
}
