/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan62.livingthing;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deskripsi : program ini menampilkan human sedang melakukan apa
 */
public abstract class LivingThing {
    public abstract void walk();
    public void breath(){
        System.out.println(" Bernafas");
    }
    
    public void eat(){
        System.out.println(" Makan");
    }
    
}
