/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_agregasi;

public class jurusan {
    private String kodeJurusan, namaJurusan;
    private mahasiswa daftar[]= new mahasiswa[10];
    private int jumlahMahasiswa;
    public jurusan(String kode, String nama){
        this.kodeJurusan=kode;
        this.namaJurusan=nama;
    }
    public String getKodeMahasiswa(){
        return this.kodeJurusan;
    }
    public String getNamaJurusan(){
        return this.namaJurusan;
    }
    public int getJumlahMahasiswa(){
        return this.jumlahMahasiswa;
    }
    public void AddMahasiswa(mahasiswa m){
        this.daftar[jumlahMahasiswa]=m;
        this.jumlahMahasiswa++;
    }
    public mahasiswa[] getDaftarMahasiswa(){
        return this.daftar;
    }
    public void cetakData(){
        int i;
        System.out.println("Kode Jurusan : " + this.kodeJurusan);
        System.out.println("Nama Jurusan : " + this.namaJurusan);
        System.out.println("Daftar Mahasiswa : ");
        for (i=0; i<jumlahMahasiswa; i++){
            System.out.println(daftar[i].getNim()+" "+daftar[i].getNama());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
