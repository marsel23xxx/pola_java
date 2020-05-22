
package bintang;
import java.util.Scanner;
public class Bentuk_Kotak {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int i,j,k;
        System.out.println("---------------------------------");
        System.out.println("       MENCOBA BENTUK KOTAK      ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan nilai k : ");
        k=input.nextInt();
        for(i=1;i<=k;i++){
            for(j=1;j<=k;j++){
                System.out.print("O ");
            }
                System.out.println();
        }
    }  
}
