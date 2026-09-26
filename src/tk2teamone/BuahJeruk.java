/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tk2teamone;

/**
 *
 * @author ThinkPad X13
 */
public class BuahJeruk {
    String jenis;
    String warna;
    String rasa;
    String harga;
    
    public BuahJeruk() {
        this.jenis = "";
        this.warna = "";
        this.rasa = "";
        this.harga = "";
    }

    public BuahJeruk(String jenis, String warna, String rasa, String harga) {
        this.jenis = jenis;
        this.warna = warna;
        this.rasa = rasa;
        this.harga = harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    
}
