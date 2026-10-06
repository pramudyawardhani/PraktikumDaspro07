import java.util.Scanner;

public class StudiKasus1_07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaPerCup = 18000;
    int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

    System.out.print("Masukkan jumlah cup: ");
    jumlahCup = sc.nextInt();

    totalHarga = jumlahCup * hargaPerCup;
    diskon = 0;

    if (totalHarga >= 100000) {
        diskon = (int) (totalHarga * 0.1);
    } 
    totalBayar = totalHarga - diskon;
    

    System.out.print("Masukkan uang bayar: Rp ");
    uangBayar = sc.nextInt();

    System.out.println("Total harga: Rp " + totalHarga);
    System.out.println("Diskon: Rp " + diskon);
    System.out.println("Total bayar: Rp " + totalBayar);
    
    if (uangBayar >= totalBayar) {
        kembalian = uangBayar - totalBayar;
        System.out.println("Kembalian: Rp " + kembalian);
    } else {
        kurang = totalBayar - uangBayar;
        System.out.println("Uang tidak cukup, kurang: Rp " + kurang);
    }
    sc.close();
    }
}
