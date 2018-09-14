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
      
        while ( uang >= 5000)
      {
          uang = uang - 5000;
          a++;
      }
        System.out.println("Banyak pecahan 5000 sebanyak " + a);
      
      while (uang >= 2000)
      {
          uang = uang - 2000;
          b++;
      }
        System.out.println("Banyak pecahan 2000 sebanyak " + b);
      
      while (uang >= 1000)
      {
          uang = uang - 1000;
          c++;
      }
        System.out.println("Banyak pecahan 1000 sebanyak " + c);
      
      while (uang >= 500)
      {
          uang = uang - 500;
          d++;
      }
        System.out.println("Banyak pecahan 500 sebanyak " + d);
      
      while (uang >= 100)
      {
          uang = uang - 100;
          e++;
      }
        System.out.println("Banyak pecahan 100 sebanyak " + e);

      
        }
}
