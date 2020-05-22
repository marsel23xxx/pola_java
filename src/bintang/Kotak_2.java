package bintang;
import java.util.Scanner;
public class Kotak_2 {
    public static void main(String [] args){
        int i,j,n;
        Scanner sc = new Scanner (System.in);
        System.out.println("------------------------------------");
        System.out.println("         KOTAK DIDALAM KOTAK        ");
        System.out.println("------------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=sc.nextInt();
        int c1=(n-1)/2;
        int c2=3*n/2-1;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i+j<=c1||i-j>=c1||j-i>=c1||i+j>=c2){
                    System.out.print("O ");                    
                }
                else{
                    System.out.print("  ");
                }
            }
                    System.out.println("");
        }
    }    
}
