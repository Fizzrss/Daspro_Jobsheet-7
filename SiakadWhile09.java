import java.util.Scanner;

public class SiakadWhile09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilai, jml;
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        jml = sc.nextInt();
        
        int i = 0;
        while (i < jml){
            System.out.println("Masukkan nilai mahasiswa ke- " + (i + 1) + ":");
            nilai = sc.nextInt();
            
            if (nilai < 0 || nilai > 100){
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai > 80 && nilai <= 100){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah A");
                System.out.println("Bagus, pertahankan nilainya");
            } else if (nilai > 73 && nilai <= 80){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah B+");
            } else if (nilai > 65 && nilai <= 73){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah B");
            } else if (nilai > 60 && nilai <= 65){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah C+");
            } else if (nilai > 50 && nilai <= 60){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah C");
            } else if (nilai > 39 && nilai <= 50){
                System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah D");
            } else {
                 System.out.println("nilai mahasiswa ke- " + (i + 1) + " adalah E");
            }
            i++;
        }
        sc.close();
    }
}
