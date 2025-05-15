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
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
    
    }
    
    public void setJmlSadel(String JmlSadel){
        this.jmlSadel=jmlSadel;
    }
    
    public String getJmlSadel(){
        return jmlSadel;
    }
    
    public int getJmlGir(){
        return jmlGir;
    }
    
    public void display(){
       System.out.println("Kelas Sepeda");
       System.out.println("jumlah roda = "+jmlRoda);
       System.out.println("jumlah warna = "+warna);
       System.out.println("jumlah sadel = "+jmlSadel);
       System.out.println("jumalh gir = "+jmlGir);
   }
    
}
