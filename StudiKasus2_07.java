import java.util.Scanner;

public class StudiKasus2_07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String namaMahasiswa, jenisKegiatan;
    int jumlahDokumen, peringkat, statusPendanaan, kurang;
    
    System.out.print("Nama mahasiswa: ");
    namaMahasiswa = sc.nextLine();

    System.out.print("Jenis kegiatan: ");
    jenisKegiatan = sc.nextLine();

    System.out.print("Jumlah dokumen yang diupload: ");
    jumlahDokumen = sc.nextInt();

    if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
        jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
        jenisKegiatan.equalsIgnoreCase("Mandiri")) {
        
        System.out.print("Peringkat juara: ");
        peringkat = sc.nextInt();

        if (peringkat >= 1 && peringkat <= 3) {
            if (jumlahDokumen == 4) {
                System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status: Peringkat juara tidak valid. Dana penghargaan tidak diberikan.");
        }

    } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
        System.out.print("Status pendanaan (1 = lolos, 0 = tidak lolos): ");
        statusPendanaan = sc.nextInt();

        if (statusPendanaan == 1) {
            if (jumlahDokumen == 4) {
                System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                System.out.println("Status: Dokumen lengkap, tetapi tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status: Tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
        }
    } else {
        if (jumlahDokumen == 4) {
            System.out.println("Status: Dokumen lengkap, tetapi jenis kegiatan tidak valid. Tidak dapat dana penghargaan");
        } else {
            System.out.println("Dokumen tidak lengkap dan jenis kegiatan tidak valid. Tidak dapat dana penghargaan");
        }
       
        sc.close();
    }
}
}