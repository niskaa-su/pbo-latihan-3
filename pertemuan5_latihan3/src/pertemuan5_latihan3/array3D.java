/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5_latihan3;

public class array3D {
    public static void main(String[] args) {
        tigaDimensi larik3= new tigaDimensi();
        larik3.cetakLarik();
    }
}
class tigaDimensi {
    int list[][][]= new int[3][4][5];
    void cetakLarik(){
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[i].length; j++){
                for (int k=0; k<list[i][j].length; k++){
                    list[i][j][k]=(int)(Math.random()*10);
                    System.out.print(list[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }System.out.println("Indeks ke [1][2][4] = " + list[1][2][4]);
    }
}
