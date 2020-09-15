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
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Keramik A
        Keramik k1 = new Keramik();
        k1.panjang = 30;
        k1.lebar = 30;
        k1.harga = 54000;
        k1.jenis = "A";
        k1.banyak = 10;
        k1.luasKeramik();
        k1.hitung();
        
        // Keramik B
        Keramik k2 = new Keramik();
        k2.panjang = 40;
        k2.lebar = 40;
        k2.harga = 65000;
        k2.jenis = "B";
        k2.banyak = 5;
        k2.luasKeramik();
        k2.hitung();
        
        // Keramik C
        Keramik k3 = new Keramik();
        k3.panjang = 30;
        k3.lebar = 40;
        k3.harga = 60000;
        k3.jenis = "C";
        k3.banyak = 8;
        k3.luasKeramik();
        k3.hitung();
    }
    
}
