package bintang;
import java.util.Scanner;
public class BentukX_bintang {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int n;
        int j;
        int i;
        System.out.println("--------------------------------");
        System.out.println("        MENCOBA BENTUK X        ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nilai N  : ");
        n=input.nextInt();
        
        for(i=n;i>=1;i--){
            for(j=n;j>=1;j--){
                if(i==j||i+j==n+1){
                    System.out.print("O");
                    System.out.print(" ");                    
                }
                else{
                    System.out.print(" ");
                }
            }
                    System.out.println("");
        }
    }    
}