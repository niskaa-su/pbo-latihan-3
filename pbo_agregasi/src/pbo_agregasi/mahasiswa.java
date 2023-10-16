/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_agregasi;

public class mahasiswa {
    private String nim, nama;
     public mahasiswa(String nim, String nama){
         this.nim=nim;
         this.nama=nama;
     }
     public void setNim(String nim){
         this.nim=nim;
     }
     public String getNim(){
         return this.nim;
     }
     public void setNama (String nama){
         this.nama=nama;
     }
     public String getNama(){
         return this.nama;
     }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
