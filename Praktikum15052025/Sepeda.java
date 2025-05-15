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
    
    public Sepeda(String jmlSadel, int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;
    }
    
    public Sepeda(String jmlSadel, int jmlGir, int jmlRoda, String warna){
        super(jmlRoda, warna);
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;
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
       System.out.println("jumlah roda = "+this.jmlRoda);
       System.out.println("jumlah warna = "+this.warna);
       System.out.println("jumlah sadel = "+this.jmlSadel);
       System.out.println("jumalh gir = "+this.jmlGir);
   }
    
}
