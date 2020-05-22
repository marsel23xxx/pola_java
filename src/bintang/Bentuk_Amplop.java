package bintang;
import java.util.Scanner;
public class Bentuk_Amplop {
   public static void main(String [] args){
       Scanner input=new Scanner(System.in);
       int j,i,n;
       System.out.println("---------------------------------");
       System.out.println("     MENCOBA MEMBUAT AMPLOP      ");
       System.out.println("---------------------------------");
       System.out.print("Masukkan Nilai N : ");
       n=input.nextInt();
       for(i=0;i<n;i++){
           for(j=0;j<n;j++){
               if(i==0||j==0||i==j||i==n-1||j==n-1||i+j==n-1){
                   System.out.print("O ");
               }
               else{
                   System.out.print("  ");
               }
           }
                   System.out.println("");
       }
   }
}
