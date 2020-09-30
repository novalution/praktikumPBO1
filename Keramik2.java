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
public class Keramik2 {
    int panjang,lebar,banyak,harga,luas;
    int luasTotal = 1000000;
    Keramik2(int p, int l, int b, int h){
        this.panjang = p;
        this.lebar = l;
        this.banyak = b;
        this.harga = h;
    }
    int luas(){
        luas = this.panjang * this.lebar;
        return luas;
    }
    int totalBox(){
        int box;
        box = this.luasTotal  / this.luas / this.banyak;
        return box;
    }
    int hargaAkhir(){
        int hargaAkhir;
        hargaAkhir = this.luasTotal  / this.luas / this.banyak * this.harga;
        return hargaAkhir;
    }
}