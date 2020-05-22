package bintang;
import java.util.Scanner;
public class Segitiga_2 {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int j,i,n;
        System.out.println("---------------------------------");
        System.out.println("       MEMBUAT SEGITIGA_2        ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan nilai N : ");
        n=input.nextInt();
        for(i=1;i<=n;i++){
            for(j=5;j>=i;j--){
                System.out.print("O ");
            }
                System.out.println();
        }                
    }    
}

