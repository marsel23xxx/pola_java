package bintang;
import java.util.Scanner;
public class V_Lookup {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int j,i,n;
        int [] num=new int[20];
        int max=0;
        System.out.println("-------------------------------");
        System.out.println("    MENCOBA MEMBUAT VLOOKUP    ");
        System.out.println("-------------------------------");
        System.out.print("Masukkan Jumlah Data : ");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.print("bilangan ["+(i+1)+"]: ");
            num[i]=sc.nextInt();            
        }
        System.out.println("--------------------------------------------");
        System.out.println("                    VLOOKUP                 ");
        System.out.println("--------------------------------------------");
        for(i=0;i<n;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        for(i=0;i<max;i++){
            for(j=0;j<n;j++){
                if(num[j]>=max-i){
                    System.out.print(" O  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        for(i=0;i<n;i++){
            System.out.print(" "+(i+1)+"  ");
        }
    }
    
}
