/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktekpbo_02;


public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar = 3;
        
        r1.cetakinfo();
        System.out.println("Luas Rectangle = "+r1.hitungLuas());
    }
}
