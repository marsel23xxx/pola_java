package bintang;

import java.util.Scanner;

public class Zigzag {
    public static void main(String args[]) {
        int tinggi = 4;
        int lebar ;
        int tp = tinggi-1;
        int penyebut = tp;
        Scanner input=new Scanner(System.in);
        System.out.println("---------------------------------");
	System.out.println("         Mencoba ZIG-ZAG         ");
	System.out.println("---------------------------------");
        System.out.print("Masukkan Nilai lebar       : ");
		lebar=input.nextInt();
        System.out.println("---------------------------------");
        for (int i = 0;i<= tp;i++) {
            for (int j = 0;j<= tp*lebar*2;j++) {
                if (j%(tp*2)== penyebut || j%(tp*2)== tp+i){
               System.out.print("O");
            }
                else
                {
                    System.out.print(" ");
                }
            }
            penyebut--;
            System.out.println();
        }
    }
}
