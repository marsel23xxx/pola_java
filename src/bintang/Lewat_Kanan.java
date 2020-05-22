package bintang;
import java.util.Scanner;
public class Lewat_Kanan {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int ukuran,s,i,j;        
        System.out.println("------------------------------------");
        System.out.println("            LEWAT KANAN             ");
        System.out.println("------------------------------------");
        System.out.print("Masukkan Ukuran Pita : ");
        ukuran=sc.nextInt();
        int spasi=ukuran;
        for(s=1;s<ukuran;s++){
            for(i=1;i<=s;i++){
                System.out.print(" O");
            }
            for(j=spasi;j>1;j--){
                System.out.print("  ");
            }
            for(i=1;i<=s;i++){
                System.out.print(" O");
            }
            System.out.println("");
            spasi--;
        }
            spasi=1;
            for(s=ukuran;s>=1;s--){
                for(i=1;i<=s;i++){
                    System.out.print(" O");
                }
                for(j=spasi;j>1;j--){
                    System.out.print("  ");
                }
                for(i=s;i>=1;i--){
                    System.out.print(" O");
                }
                System.out.println("");
                spasi++;
            }
    
        }        
    }
