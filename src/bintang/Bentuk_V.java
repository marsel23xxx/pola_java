package bintang;
import java.util.Scanner;
public class Bentuk_V {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("--------------------------------");
        System.out.println("      MENCOBA MEMBENTUK V       ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nilai N : ");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
                System.out.print("O");
                for(j=1;j<(i-1)*2;j++){
                    System.out.print(" ");
                }
                if(i>1){
                    System.out.print(" ");
                }
                 System.out.print("\n");
        }        
    }    
 }
