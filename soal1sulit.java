
import java.util.Scanner;

public class soal1sulit {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("===== Rekapitulasi Nilai Ujian Produktif RPL ====");
    int jumlahSiswa, temp = 0;
    System.out.println("Masukkan Jumlah Siswa: ");
    jumlahSiswa = input.nextInt();
    for (int i = 1; i <= jumlahSiswa; i++){
            System.out.println("Nilai siswa ke- " +i);
            int nilai = input.nextInt();
            temp +=nilai;
        }
        System.out.println("Rata-rata Jumlah siswa " + jumlahSiswa + " adalah "+ temp/jumlahSiswa);

}
}
