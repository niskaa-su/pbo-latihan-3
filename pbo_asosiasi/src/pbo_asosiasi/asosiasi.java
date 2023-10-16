/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_asosiasi;

public class asosiasi {
    public static void main(String[] args) {
        mahasiswa mhs1=new mahasiswa("2022001", "Mark");
        mahasiswa mhs2=new mahasiswa("2022002","Niska");
        dosen dsn=new dosen("TI005");
        dsn.setNimMhs(mhs1.getNim());
        dsn.setNimMhs(mhs2.getNim());
        dsn.cetakData();
    }
    
}
