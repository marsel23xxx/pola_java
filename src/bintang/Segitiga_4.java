package bintang;
import java.util.Scanner;
public class Segitiga_4 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n,k;
        System.out.println("---------------------------------");
        System.out.println("       MEMBUAT SEGITIGA 4        ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Nilai n : ");
        n=input.nextInt();
        for(i=n;i>=1;i--){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("O");
            }
            System.out.println();
        }
    }    
}
