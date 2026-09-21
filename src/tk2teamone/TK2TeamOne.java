/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tk2teamone;

/**
 *
 * @author asus4
 */
public class TK2TeamOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Bagian Dhea
        BuahMangga Mangga =  new BuahMangga("Mangga Madu","Kuning","Manis","Rp30.000/kg");
        Mangga.setJenis("Gadung");
        Mangga.setWarna("Hijau");
        Mangga.setRasa("Manis");
        Mangga.setHarga("Rp20.000/kg");
        System.out.println("=====MANGGA - DHEA=====");
        System.out.println("Jenis : " + Mangga.getJenis());
        System.out.println("Warna : " + Mangga.getWarna());
        System.out.println("Rasa : " + Mangga.getRasa());
        System.out.println("Harga : " + Mangga.getHarga());
        System.out.println("=======================\n");
                
    }
    
}
