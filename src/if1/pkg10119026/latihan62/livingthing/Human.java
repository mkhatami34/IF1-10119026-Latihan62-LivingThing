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
public class Human extends LivingThing {
    private String nama;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }

    @Override
    public void walk() {
        System.out.println(" sedang berjalan");
    }
    
}
