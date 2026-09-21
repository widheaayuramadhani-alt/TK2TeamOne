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
        
        //Bagian Athoil
        BuahJeruk Jeruk = new BuahJeruk("Jeruk nipis","Hijau","Asam","Rp7.000/kg");
        Jeruk.setJenis("Bali");
        Jeruk.setWarna("Hijau kekuningan");
        Jeruk.setRasa("Manis");
        Jeruk.setHarga("Rp65.000/kg");
        System.out.println("=====JERUK - ATHOIL=====");
        System.out.println("Jenis : " + Jeruk.getJenis());
        System.out.println("Warna : " + Jeruk.getWarna());
        System.out.println("Rasa : " + Jeruk.getRasa());
        System.out.println("Harga : " + Jeruk.getHarga());
        System.out.println("====================\n");
        
        //Bagian Najwa
        BuahMelon Melon = new BuahMelon("Melon sakata","Hijau","Manis","Rp25.000/kg");
        Melon.setJenis("Cenery");
        Melon.setWarna("Kuning");
        Melon.setRasa("Manis");
        Melon.setHarga("Rp30.000/kg");
        System.out.println("=====MELON - NAJWA=====");
        System.out.println("Jenis : " + Melon.getJenis());
        System.out.println("Warna : " + Melon.getWarna());
        System.out.println("Rasa : " + Melon.getRasa());
        System.out.println("Harga : "+ Melon.getHarga());
        System.out.println("=======================\n");
    }
    
}
