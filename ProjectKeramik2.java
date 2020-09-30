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
public class ProjectKeramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Keramik2 k1 = new Keramik2(30,30,10,54000);
        k1.luas();
        System.out.println("Harga total keramik A adalah Rp" + k1.hargaAkhir() + " dan berjumlah " + k1.totalBox() + " box");

        Keramik2 k2 = new Keramik2(40,40,5,65000);
        k2.luas();
        System.out.println("Harga total keramik B adalah Rp" + k2.hargaAkhir() + " dan berjumlah " + k2.totalBox() + " box");
        
        Keramik2 k3 = new Keramik2(30,40,8,60000);
        k3.luas();
        System.out.println("Harga total keramik B adalah Rp" + k3.hargaAkhir() + " dan berjumlah " + k3.totalBox() + " box");
    }
}
