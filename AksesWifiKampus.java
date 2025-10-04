import java.util.Scanner;

public class AksesWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = sc.nextLine().trim().toLowerCase();

        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } 
        else if (jenisPengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang telah diambil: ");
            int sks = sc.nextInt();

            if (sks >= 144) {
                System.out.println("Akses WiFi diberikan (mahasiswa lulus).");
            } else {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            }
        } 
        else {
            System.out.println("Akses WiFi ditolak (bukan civitas akademika).");
        }

        sc.close();
    }
}
