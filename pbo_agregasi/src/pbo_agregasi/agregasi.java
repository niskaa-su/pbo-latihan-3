/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_agregasi;

public class agregasi {
    public static void main(String[] args) {
        jurusan prodi=new jurusan("22","Teknik Informatika");
        mahasiswa mhs1= new mahasiswa("2022001", "Mark");
        mahasiswa mhs2= new mahasiswa("2022002", "Niska");
        prodi.AddMahasiswa(mhs1);
        prodi.AddMahasiswa(mhs2);
        prodi.cetakData();
    }
    
}
