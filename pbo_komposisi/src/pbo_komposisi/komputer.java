/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_komposisi;

public class komputer {
    private String merk,tipe;
    private ssd ssd;
    private ram ram;
    private cpu cpu;
    public komputer(String merk, String tipe){
        this.merk=merk;
        this.tipe=tipe;
    }
    public void addKomponen(ssd ssd, ram ram, cpu cpu){
        this.ssd=ssd;
        this.ram=ram;
        this.cpu=cpu;
    }
    public void cetakProduk(){
        System.out.println("Spesifikasi "+ this.merk+"tipe"+this.tipe);
        System.out.println("CPU : "+cpu.getNama());
        System.out.println("RAM : "+ ram.getKapasitas());
        System.out.println("SSD : "+ssd.getKapasitas());
    }
    public static void main(String[] args) {

    }
    
}
