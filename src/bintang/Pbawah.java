package bintang;
import java.util.Scanner;
public class Pbawah {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int ukuran;
        System.out.println("-------------------------------");
        System.out.println("         PIRAMIDA BAWAH        ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Ukuran Piramida   : ");
        ukuran =input.nextInt();
        
        int spasi=ukuran/2;
        int tinggi=ukuran-spasi;
        
        for(int i=tinggi;i>=1;i--){
            for(int j=spasi;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=ukuran;k++){
                System.out.print("O");                
            }
            ukuran-=2;
            System.out.println();
        }
    }    
}
