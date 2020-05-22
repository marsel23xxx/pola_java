package bintang;
import java.util.Scanner;
public class Labirin {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int j,i,n,tinggi=5;
        int lebar;
        System.out.println("--------------------------------");
        System.out.println("    MENCOBA MEMBUAT LABIRIN     ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan nilai Lebar : ");
        lebar=sc.nextInt();
        for(i=1;i<=tinggi;i++){
            for(j=1;j<=lebar;j++){
                if(i != tinggi){
                    System.out.print("##");
                }
                else{
                    System.out.print("  ");
                }
                for(n=1;n<=4;n++){
                    if(i==1||n==1||n==4){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("##");
                    }
                }
                if(i !=tinggi){
                    System.out.print("##");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }    
}
