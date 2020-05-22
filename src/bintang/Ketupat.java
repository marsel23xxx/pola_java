package bintang;
import java.util.Scanner;
public class Ketupat {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int i,j,k;
        int tinggi;
        System.out.println("---------------------------------");
        System.out.println("         MENCOBA KETUPAT         ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan ukuran Ketupat : ");
        tinggi=input.nextInt();
        for(i=1;i<=tinggi;i++){
            for(k=tinggi-1;k>=i;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("O ");
            }
            System.out.println("");
        }
            for(i=tinggi-1;i>=1;i--){
                for(k=tinggi-1;k>=i;k--){
                    System.out.print(" ");
                }
                for(j=i;j>=1;j--){
                    System.out.print("O ");
                }
                System.out.println("");
            }
    }
}
