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
        
        //Bagian Tony
        BuahKiwi Kiwi = new BuahKiwi("Green Kiwi", "Hijau", "Manis Asam", "Rp15.000/Buah");
        Kiwi.setJenis("Kiwi Gold");
        Kiwi.setWarna("Kuning Keemasan");
        Kiwi.setRasa("Manis");
        Kiwi.setHarga("25.000/Buah");
        System.out.println("=====KIWI - TONY=====");
        System.out.println("Jenis : " + Kiwi.getJenis());
        System.out.println("Warna : " + Kiwi.getWarna());
        System.out.println("Rasa : " + Kiwi.getRasa());
        System.out.println("Harga : " + Kiwi.getHarga());
        System.out.println("=======================\n");
        
        // Bagian Hamdan
        BuahSemangka Semangka= new BuahSemangka("Inul", "Merah", "Manis berair", "Rp20.000/Kg");
        Semangka.setJenis("Semangka Merah");
        Semangka.setWarna("Merah");
        Semangka.setRasa("Manis berair");
        Semangka.setHarga("Rp20.000/Kg");
        System.out.println("=====SEMANGKA - HAMDAN=====");
        System.out.println("Jenis : "+ Semangka.getJenis());
        System.out.println("Warna : "+ Semangka.getWarna());
        System.out.println("Rasa ; "+ Semangka.getRasa());
        System.out.println("Harga ; "+ Semangka.getHarga());
        System.out.println("=======================\n");
        
        // Bagian Ala
        BuahDurian Durian = new BuahDurian("Durian Montong", "Kuning Gading Pekat", "Dominan Manis", "Rp95.000/Kg");
        Durian.setJenis("Durian Musang King");
        Durian.setWarna("Kuning Keemasan");
        Durian.setRasa("Manis Pahit");
        Durian.setHarga("Rp250.000/Kg");
        System.out.println("======DURIAN - ALA=======");
        System.out.println("Jenis : "+ Durian.getJenis());
        System.out.println("Warna : "+ Durian.getWarna());
        System.out.println("Rasa : "+ Durian.getRasa());
        System.out.println("Harga : "+ Durian.getHarga());
        System.out.println("=========================");
        
    }
    
}
