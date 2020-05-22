package bintang;
import java.util.Scanner;
public class Bentuk_Segitiga {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
         int tinggi;
         
         System.out.println("-------------------------------");
         System.out.println("      PEMBENTUKAN SEGITIGA     ");
         System.out.println("-------------------------------");
         System.out.print("Masukkan Tinggi Segitiga : ");
         tinggi=input.nextInt();
         int i,j,k,n,x=1;
         int spasi=tinggi-1;
         
         for(i=1;i<=tinggi;i++){
             for(n=1;n<=tinggi;n++){
                 System.out.print(" ");
             }
             for(k=spasi;k>=i;k--){
                 System.out.print(" ");
             }
             for(j=1;j<=i;j++){
                 System.out.print("O ");
             }
                 System.out.println("");
         }
             for(i=0;i<tinggi;i++){
                 for(j=spasi;j>i;j--){
                     System.out.print(" ");
                 }
                 for(k=0;k<=i;k++){
                     System.out.print("O ");
                 }
                 for(n=(tinggi+tinggi-2);n>=x;n--){
                     System.out.print(" ");
                 }
                 for(k=0;k<=i;k++){
                     System.out.print("O ");
                 }
                 x+=2;
                 System.out.println("");
        }
    }    
}
