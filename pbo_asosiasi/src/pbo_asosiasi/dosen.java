/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_asosiasi;

public class dosen {
    private String kodeDosen;
    private String nimMHS[]= new String[5];
    private int jmlMhs;
    public dosen(String kode){
        this.kodeDosen=kode;
    }
    public void setKodeDosen(String kodeDosen){
        this.kodeDosen=kodeDosen;
    }
    public String getKodeDosen(){
        return this.kodeDosen;
    }
    public void setNimMhs(String nimMhs){
        if(jmlMhs <this.nimMHS.length);
        jmlMhs++;
    }
    public int getJmlMahasiswa(){
        return this.jmlMhs;
    }
    public String getNimMhs(int indeks){
        return (nimMHS[indeks]);
    }
    public void cetakData(){
        System.out.println("Kode Dosen : " + kodeDosen);
        System.out.println("Daftar Mahasiswa : ");
        for (int i=0; i<jmlMhs; i++){
            System.out.println(nimMHS[i]);
        }
    }
    public static void main(String[] args) {
    }
}
