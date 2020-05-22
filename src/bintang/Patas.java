package bintang;
import java.util.Scanner;
public class Patas {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int ukuran=1;
        int tinggi;
        System.out.println("------------------------------");
        System.out.println("         PIRAMIDA ATAS        ");
        System.out.println("------------------------------");
        System.out.print("Masukkan ukuran Piramida : ");
        tinggi=input.nextInt();
        int spasi=tinggi-1;
        for(int i=0;i<tinggi;i++){
            for(int j=spasi;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<ukuran;k++){
                System.out.print("O");
            }
            ukuran+=2;
            System.out.println();
        }        
    }        
}
