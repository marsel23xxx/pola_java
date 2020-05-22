package bintang;
import java.util.Scanner;
public class Bentuk_A {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("--------------------------------");
        System.out.println("        MENCOBA BENTUK A        ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan nilai N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
                System.out.print("O");
                for(j=1;j<(i-1)*2;j++){
                    System.out.print(" ");
                }
                if(i>1){
                    System.out.print("O");
                }
                    System.out.print("\n");
        }      
    }    
}
