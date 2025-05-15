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
public class SepedaListrik extends Sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public SepedaListrik(){
    }
    
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks=kecepatanMaks;
    }
    
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    
    public void setJarakTempuh(){
        this.jarakTempuh=jarakTempuh;
    }
    
    public int getJarakTempuh(){
        return jarakTempuh;
    }
    
    public void display(){
       System.out.println("Kelas Sepeda Listrik");
       System.out.println("jumlah roda = "+jmlRoda);
       System.out.println("jumlah warna = "+warna);
       System.out.println("jumlah sadel = "+jmlSadel);
       System.out.println("jumalh gir = "+jmlGir);
       System.out.println("kecepatan maks = "+kecepatanMaks);
       System.out.println("jarak tempuh = "+jarakTempuh);
   }
    
}
