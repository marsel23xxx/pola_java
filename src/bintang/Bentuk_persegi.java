package bintang;
import java.util.Scanner;
public class Bentuk_persegi {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("-------------------------------");
        System.out.println("      PEMBENTUKAN PERSEGI      ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((j==1||j==n)||(i==1||i==n))
                    System.out.print(i+" ");
                else
                    System.out.print("  ");
            }
                    System.out.println();
        }
    }    
}
