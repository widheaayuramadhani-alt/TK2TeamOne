/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Al
 */
public class TestDefaultEncapsulation {
    
    public static void main(String[] args) {
        
         BuahDurian Durian = new BuahDurian();
         
         Durian.jenis = "Durian Lokal";
         System.out.println("Jenis = " + Durian.getJenis());
         
         BuahSemangka Semangka = new BuahSemangka();
         
         Semangka.jenis = "Semangka Lokal";
         System.out.println("Jenis = " + Semangka.getJenis());
    }
    
}
