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
    
    public SepedaListrik(int kecepatanMaks, int jarakTempuh){
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;
    }
    
    public SepedaListrik(int kecepatanMaks, int jarakTempuh, String jmlSadel, int jmlGir, int jmlRoda, String warna){
        super(jmlSadel, jmlGir, jmlRoda, warna); 
        this.kecepatanMaks=kecepatanMaks;
        this.jarakTempuh=jarakTempuh;
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
       super.display();
       System.out.println("kecepatan maks = "+this.kecepatanMaks+"km/h");
       System.out.println("jarak tempuh = "+this.jarakTempuh+"km");
   }
    
}
