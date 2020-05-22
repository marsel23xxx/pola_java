package bintang;
import java.util.Scanner;
public class Patas_2 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n,k;
        System.out.println("---------------------------------");
        System.out.println("       MEMBUAT PIRAMIDA ATAS     ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Nilai n : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("O ");
            }
            System.out.println();
        }
    }    
}
