import java.util.Scanner;

public class Tugas109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pelanggan, jmlTiket = 0, hargaTiket = 50000, totalTiketTerjual = 0;
        double diskon, totalPenjualan = 0.0, totalBayar = 0.0;
        
        System.out.println("======================================");
        System.out.println("-LAPORAN PENJUALAN TIKET DALAM SEHARI-");
        System.out.println("======================================");
        System.out.println("Masukkan banyak pelanggan dalam sehari: ");
        pelanggan = input.nextInt();
        System.out.println("======================================");
        
        int i = 1;
        while(i <= pelanggan){
            System.out.println("pelanggan ke- " + i);
            System.out.println("Jumlah tiket yang dibeli: ");
            jmlTiket = input.nextInt();
            
            if (jmlTiket < 0){
                System.out.println("angka tidak boleh negatif");
                continue;
            }
            
            totalBayar = jmlTiket * hargaTiket;
            if (jmlTiket > 4 && jmlTiket <= 10){
                diskon = (1.0 - 0.1);
                totalBayar *= diskon;
            } else if (jmlTiket > 10 ){
                diskon = (1.0 - 0.15);
                totalBayar *= diskon;
            } else {
                diskon = (1.0 - 0.0);
                totalBayar *= diskon;
            }
            i++;
            System.out.println("Harga tiket yang dibayar: " + totalBayar);
            totalTiketTerjual += jmlTiket;
            totalPenjualan += totalBayar;
        }
        System.out.println("======================================");
        System.out.println("Total tiket yang terjual    : " + totalTiketTerjual);
        System.out.println("Total harga penjualan       : " + totalPenjualan);
        System.out.println("======================================");
        input.close();
    }
    
}
