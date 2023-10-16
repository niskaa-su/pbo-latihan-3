/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5_latihan3;

public class array2D {
    public static void main(String[] args) {
        duaDimensi larik2 = new duaDimensi();
        larik2.tampilarray();
    }
}
class duaDimensi{
    int list[][]={{10,11,12,13,14},
        {30,31,32,33,34},
        {50,51,52,53,54}};
    public void tampilarray(){
        for (int i=0; i<list.length; i++){
            for (int j=0; j<list[0].length; j++){
            System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nIndeks ke [1][2]= " + list[1][2]);
    }
}
