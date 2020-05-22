package bintang;
import java.util.Scanner;
public class Bentuk_Jendela {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        System.out.println("--------------------------------");
        System.out.println("    MENCOBA MEMBENTUK JENDELA   ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan nilai N : ");
        n=input.nextInt();
        int j1=(n-1)/2;
        int j2=3*n/2-1;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i+j==j1||i-j==j1||j-i==j1||i+j==j2||i==j1||j==j1){
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
