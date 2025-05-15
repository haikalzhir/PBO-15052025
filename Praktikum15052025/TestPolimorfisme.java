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
        
        Kendaraan kendaraan = new Kendaraan();
        kendaraan.getJmlRoda();
        kendaraan.getWarna();
        
        System.out.println("input kelengkapan kendaraan anda!!!!!!!1");
        System.out.print("Jumlah roda  = ");
        int jmlRoda = haik.nextInt();
        System.out.print("warna kendaraan = ");
        int warna = haik.nextInt();
        
        Mobil mobil = new Mobil();
        mobil.getBahanBakar();
        mobil.getKapasitasMesin();
        
        System.out.println("input pertanyaan pada mobil anda!!");
        System.out.print("Bahan bakar mobil = ");
        int bahanBakar = haik.nextInt();
        System.out.print("Kapasitas mesin = ");
        int kapasitasMesin = haik.nextInt();
        
        Sepeda sepeda = new Sepeda();
        sepeda.getJmlSadel();
        sepeda.getJmlGir();
        
        System.out.println("input pertanyaan pada sepeda tsb!!!");
        System.out.print("jumlah sadel = ");
        int jmlSadel = haik.nextInt();
        System.out.print("Jumlah gir = ");
        int jmlGir = haik.nextInt();
        
        SepedaListrik sepedaListrik = new SepedaListrik();
        sepedaListrik.getKecepatanMaks();
        sepedaListrik.getJarakTempuh();
        
        System.out.println("input sepeda listrik!!!!");
        System.out.print("Kecepatan Maks = ");
        int kecepatanMaks = haik.nextInt();
        System.out.print("Jarak tempuh = ");
        int jarakTempuh = haik.nextInt();
        
        Taksi taksi = new Taksi();
        taksi.getTarifAwal();
        taksi.getTarifPerKm();
        
        System.out.println("input taksi = ");
        System.out.print("tarif awal = ");
        int tarifAwal = haik.nextInt();
        System.out.print("tarif per km = ");
        int tarifPerKM = haik.nextInt();
        
        Truk truk = new Truk();
        truk.getMuatanMaks();
        
        System.out.println("input Truk = ");
        int muatanMaks = haik.nextInt();
        
        
    }
    
}
