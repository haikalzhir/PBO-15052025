/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum15052025;

/**
 *
 * @author Asaaa
 */
import java.util.Scanner;
public class TestPolimorfisme {
    public static void main(String[] args){
        Scanner haik =  new Scanner(System.in);
        
        System.out.println("HAIKAL ZAHIR FAIZ");
        System.out.println("PRAKTIKUM PBO");
        System.out.println("2401081017");
        System.out.println("TEKNIK KOMPUTER 1A");
        
        System.out.println("Input Spesifikasi Kendaraan:");
        System.out.print("Jumlah Roda: ");
        int jmlRoda = haik.nextInt();
        haik.nextLine();

        System.out.print("Warna Kendaraan: ");
        String warna = haik.nextLine();

        Kendaraan kendaraan = new Kendaraan(jmlRoda, warna);
        System.out.println("\n===Data Kendaraan===");
        kendaraan.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Mobil:");
        System.out.print("Bahan Bakar Mobil: ");
        String bahanBakar = haik.nextLine();

        System.out.print("Kapasitas Mesin Mobil (cc): ");
        int kapasitasMesin = haik.nextInt();
        haik.nextLine();

        Mobil mobil = new Mobil(bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Mobil===");
        mobil.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Sepeda:");
        System.out.print("Jumlah Sadel Sepeda: ");
        String jmlSadel = haik.nextLine();

        System.out.print("Jumlah Gir Sepeda: ");
        int jmlGir = haik.nextInt();
        haik.nextLine();

        Sepeda sepeda = new Sepeda(jmlSadel, jmlGir, jmlRoda, warna);
        System.out.println("\n===Data Sepeda===");
        sepeda.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Truk:");
        System.out.print("Muatan Maksimal Truk (kg): ");
        int muatanMaks = haik.nextInt();
        haik.nextLine();

        Truk truk = new Truk(muatanMaks, bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Truk===");
        truk.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Taksi:");
        System.out.print("Tarif Awal Taksi (Rp): ");
        int tarifAwal = haik.nextInt();

        System.out.print("Tarif Per KM Taksi (Rp): ");
        int tarifPerKm = haik.nextInt();
        haik.nextLine();

        Taksi taksi = new Taksi(tarifAwal, tarifPerKm, bahanBakar, kapasitasMesin, jmlRoda, warna);
        System.out.println("\n===Data Taksi===");
        taksi.display();
        System.out.println("\n-------------------------");

        System.out.println("Input Spesifikasi Sepeda Listrik:");
        System.out.print("Jarak Tempuh Sepeda Listrik (km): ");
        int jarakTempuh = haik.nextInt();

        System.out.print("Kecepatan Maks Sepeda Listrik (km/h): ");
        int kecepatanMaks = haik.nextInt();
        haik.nextLine();

        SepedaListrik sepedaListrik = new SepedaListrik(kecepatanMaks, jarakTempuh, jmlSadel, jmlGir, jmlRoda, warna);
        System.out.println("\n===Data Sepeda Listrik===");
        sepedaListrik.display();
        System.out.println("\n-------------------------");
    
    }
    
}
