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
public class Kendaraan {
   protected int jmlRoda;
   protected String warna;
   
   public Kendaraan(){
   }
   
   public Kendaraan(int jmlRoda, String warna){
       this.jmlRoda=jmlRoda;
       this.warna=warna;
   }
   
   public void setJmlRoda(int JmlRoda){
       this.jmlRoda=jmlRoda;
   }
   
   public int getJmlRoda(){
       return jmlRoda;
   }
   
   public void setWarna(String Warna){
       this.warna=warna;
   }
   
   public String getWarna(){
       return warna;
   }
   
   public void display(){
       System.out.println("Kelas Kendaraan");
       System.out.println("jumlah roda = "+this.jmlRoda);
       System.out.println("warna = "+this.warna);
   }
    
}
