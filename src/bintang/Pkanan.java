package bintang;
import java.util.Scanner;
public class Pkanan {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int ukuran;
        System.out.println("-------------------------------");
        System.out.println("        PIRAMIDA KANAN         ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Ukuran Piramida   : ");
        ukuran=input.nextInt();
        for(int i=ukuran;i>=-ukuran;i--){
            for(int j=ukuran;j>=Math.abs(i);j--){
                System.out.print("O");
            }
                System.out.println(" ");
        }
    }   
}
