import java.util.Scanner;
public class UjiantengahSemester {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalNilai = 0;
        int jMahasiswa = 0;
        while (true) {
            try {
                System.out.print("Masukkan jumlah mahasiswa: ");
                jMahasiswa = scan.nextInt();
                if (jMahasiswa > 0) {
                    break;
                } else {
                    System.out.println("Harap masukkan jumlah mahasiswa yang benar!");
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Harap masukkan angka.");
                scan.nextLine(); // Membersihkan input yang tidak valid
            }
        }
        for (int i = 1; i <= jMahasiswa; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan nilai mahasiswa " + i + ": ");
                    double nilaiMahasiswa = scan.nextDouble();
                    if (nilaiMahasiswa >= 0 && nilaiMahasiswa <= 100) {
                        totalNilai += nilaiMahasiswa;
                        break;
                    } else {
                        System.out.println("Input nilai jangan kurang dari 0 dan lebih dari 100.");
                    }
                } catch (Exception e) {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    scan.nextLine(); // Membersihkan input yang tidak valid
                }
            }
        }
        double nilaiRataRata = totalNilai / jMahasiswa;
        System.out.println("Nilai rata-rata kelas ini adalah: " + nilaiRataRata);
        if (nilaiRataRata > 85) {
            System.out.println("Kelas ini berprestasi!");
        }
        scan.close();
    }
}
