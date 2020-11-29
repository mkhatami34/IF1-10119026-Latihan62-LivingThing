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
public class IF110119026Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Muhammad Khatami");
        
        System.out.print(human.getNama());
        human.walk();
        
        System.out.print(human.getNama());
        human.breath();
        
        System.out.print(human.getNama());
        human.eat();
    }
    
}
