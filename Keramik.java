/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author ASUS
 */
public class Keramik {
    int panjang,lebar,banyak,luas,harga;
    String jenis;
    int luasTotal = 1000000;
    float banyakKeramik,totalBox,hargaAkhir;
    
    void luasKeramik(){
        luas = this.panjang * this.lebar;
    }
    void hitung(){
        banyakKeramik = this.luasTotal / this.luas;
        if (banyakKeramik - Math.ceil(banyakKeramik) != 0){
            banyakKeramik = (int)Math.ceil(banyakKeramik);
        }
        totalBox = this.banyakKeramik / this.banyak;
        if (totalBox - Math.ceil(totalBox) != 0){
            totalBox = (int)Math.ceil(totalBox);
        }
        hargaAkhir = this.totalBox * this.harga;
        System.out.println("Harga total keramik " + jenis + " adalah Rp" + (int)hargaAkhir + " dan berjumlah " + (int)totalBox + " box");
    }
}
    
