/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class dynamicprogaming2 {
    public static void main(String[] args) {
        String identitas;
      identitas = "Zara zeva az zurra / 40 / XRPL3";
        System.out.println("Nama / No.absen / Kelas " + identitas);
        
     Scanner baca = new Scanner (System.in);
        System.out.println("Berat : " );
        int n = baca.nextInt();
        double o = 0, i = 0, j = 0, g = 0, m = 0, l, b = 0;
        int[] Berat = new int [] {4, 5, 2, 7, 3};
        int[] Harga = new int[] {10000, 7000, 5000, 3000, 2000};
        
        int berat = Input();
        
        Proses(berat, Berat, Harga);
        
    }
    
    private static int Input()
    {
         Scanner baca = new Scanner (System.in);
         
         System.out.print("Berat : ");
         int berat = baca.nextInt();
         
         return berat;
    }
    
    private static void Proses (int berat, int[] Berat, int[] Harga)
    {
        int jumlah = 0;
        for (int i = 0; i < Berat.length; i++) {
            int n = 0;
            while (berat >= Berat[i])
            {
                berat = berat - Berat[i];
                n++;
            }
            int total = n * Harga[i];
            System.out.println(Berat[i] + "Sebanyak " + n + " dengan harga Rp" + total);
            jumlah = jumlah + total;
            
        }
        System.out.println("\nTotal Bayaran: Rp " + jumlah);
    }
}
