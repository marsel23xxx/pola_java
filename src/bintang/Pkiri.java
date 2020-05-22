
package bintang;
import java.util.Scanner;
public class Pkiri {
    public static void main(String args []) {
        Scanner input = new Scanner(System.in);
        int ukuran;
        System.out.println("-------------------------------");
        System.out.println("         PIRAMIDA KIRI         ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Ukuran Piramida   : ");
        ukuran =input.nextInt();
       
        for(int i=ukuran;i>=-ukuran;i--){
            for(int j=1;j<=Math.abs(i);j++){
                System.out.print(" ");
            }
                for(int k=ukuran;k>=Math.abs(i);k--){
                    System.out.print("O");
                }
                    System.out.println();
        }
    }
}