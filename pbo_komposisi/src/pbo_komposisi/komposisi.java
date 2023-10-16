/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_komposisi;

public class komposisi {

    public static void main(String[] args) {
        komputer komputer=new komputer("Asus","ZenBook 14 UM431DA");
        komputer.addKomponen(new ssd("500 GB"),new ram("4 GB"),new cpu("Intel i7"));
        komputer.cetakProduk();
    }
    
}
