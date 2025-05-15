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
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public Taksi(){
    }
    
    public void setTarifAwal(){
        this.tarifAwal=tarifAwal;
    }
    
    public int getTarifAwal(){
        return tarifAwal;
    }
    
    public void setTarifPerKm(){
        this.tarifPerKm=tarifPerKm;
    }
    
    public int getTarifPerKm(){
        return tarifPerKm;
    }
    
    public void display(){
       System.out.println("Kelas Taksi");
       System.out.println("jumlah roda = "+jmlRoda);
       System.out.println("jumlah warna = "+warna);
       System.out.println("bahan bakar = "+bahanBakar);
       System.out.println("kapasitas mesin = "+kapasitasMesin);
       System.out.println("tarif awal = "+tarifAwal);
       System.out.println("tarif perkm = "+tarifPerKm);
   }
    
}
