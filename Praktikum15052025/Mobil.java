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
public class Mobil extends Kendaraan{
    protected String bahanBakar;
    protected int kapasitasMesin;
    
    public Mobil(){
    }
    
    public void setBahanBakar(String BahanBakar){
        this.bahanBakar=bahanBakar;
    }
    
    public String getBahanBakar(){
        return bahanBakar;
    }
    
    public int getKapasitasMesin(){
        return kapasitasMesin;
    }
    
    public void display(){
       System.out.println("Kelas Mobil");
       System.out.println("jumlah roda = "+jmlRoda);
       System.out.println("jumlah warna = "+warna);
       System.out.println("bahan bakar = "+bahanBakar);
       System.out.println("kapasitas mesin = "+kapasitasMesin);
   }
    
}
