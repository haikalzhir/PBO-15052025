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
    
    public Mobil(String bahanBakar, int kapasitasMesin){
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
    }
    
    public Mobil(String bahanBakar, int kapasitasMesin, int jmlRoda, String warna){
        super(jmlRoda, warna);
        this.bahanBakar=bahanBakar;
        this.kapasitasMesin=kapasitasMesin;
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
       System.out.println("jumlah roda = "+this.jmlRoda);
       System.out.println("jumlah warna = "+this.warna);
       System.out.println("bahan bakar = "+this.bahanBakar);
       System.out.println("kapasitas mesin = "+this.kapasitasMesin);
   }
    
}
