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
public class dynamicprograming1 {
    public static void main(String[] args) {
      String identitas;
      identitas = "Zara zeva az zurra / 40 / XRPL3";
        System.out.print("Nama / No.absen / Kelas " + identitas);
     
           
      Scanner input = new Scanner(System.in);
    
      int a = 0, b = 0, c = 0, d = 0, e = 0;
      
      int[] nominal = new int[] {100,500,1000,2000,5000};
      
      System.out.println("Masukkan nominal pecahan: ");
      int uang = input.nextInt();
      
        }
}
