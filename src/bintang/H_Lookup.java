package bintang;
import java.util.Scanner;
public class H_Lookup {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int j,i,n;
        int [] num=new int[20];
        System.out.println("-------------------------------");
        System.out.println("    MENCOBA MEMBUAT HLOOKUP    ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan jumlah Data : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Bilangan ["+(i+1)+"]: ");
            num[i]=sc.nextInt();            
        }
        System.out.println("--------------------------------------------");
        System.out.println("                  HLOOKUP                   ");
        System.out.println("--------------------------------------------");
        for(i=0;i<n;i++){
            System.out.print("["+(i+1)+"]  ");
            for(j=0;j<num[i];j++){
                System.out.print("O ");
            }
            System.out.println("\n");
        }
    }    
}
