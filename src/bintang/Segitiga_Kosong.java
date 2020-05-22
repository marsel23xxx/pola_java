package bintang;
import java.util.Scanner;
public class Segitiga_Kosong {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int j,i,n;
        System.out.println("---------------------------------");
        System.out.println("     MEMBUAT SEGITIGA KOSONG     ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Nilai n : ");
        n=input.nextInt();
        System.out.print("O\n");
        for(i=1;i<=n;i++){
            System.out.print("O");
        for(j=1;j<i;j++){
            System.out.print(" ");
        }
            System.out.print("O\n");
        }
        for(j=1;j<=n+2;j++){
            System.out.print("O");
        }
    }    
}
