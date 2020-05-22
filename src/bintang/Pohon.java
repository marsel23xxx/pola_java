package bintang;
import java.util.Scanner;
public class Pohon {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int j,i,n,tinggi;
        System.out.println("---------------------------");
        System.out.println("   MENCOBA MEMBUAT POHON   ");
        System.out.println("---------------------------");
        System.out.print("Masukkan nilai tinggi : ");
        tinggi=sc.nextInt();
        int lebar=4;
        int spasi=lebar*5;
        int r=1;
        int m=1;
        for(r=1;r<=tinggi;r++){
            for(i=m;i<=lebar;i++){
                for(j=spasi;j>=i;j--){
                    System.out.print(" ");
                }
                for(n=1;n<=i;n++){
                    System.out.print("# ");
                }
                    System.out.println();
            }
            m+=2;           
            lebar+=2;
        }
        for(i=1;i<=4;i++){
            for(j=spasi-3;j>=1;j--){
                System.out.print(" ");
            }
            for(n=1;n<=4;n++){
                System.out.print("O ");
            }
            System.out.println(); 
        }        
    }    
}
