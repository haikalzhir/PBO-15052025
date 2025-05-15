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
public class Truk extends Mobil {
    protected String muatanMaks;
    
    public Truk(){
    }
    
    public void setMuatanMaks(String muatanMaks){
        this.muatanMaks=muatanMaks;
    }
    
    public String getMuatanMaks(){
        return muatanMaks;
    }
    
    public void display(){
       System.out.println("Kelas Truk");
       System.out.println("jumlah roda = "+jmlRoda);
       System.out.println("jumlah warna = "+warna);
       System.out.println("bahan bakar = "+bahanBakar);
       System.out.println("kapasitas mesin = "+kapasitasMesin);
       System.out.println("muatan maks = "+muatanMaks);
   }
    
}
