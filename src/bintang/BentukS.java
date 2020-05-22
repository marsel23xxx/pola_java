package bintang;
import java.util.Scanner;
public class BentukS {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int i,j,k;
        System.out.println("---------------------------------");
        System.out.println("        MENCOBA BENTUK S         ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan nilai k : ");
        k=input.nextInt();
        for(i=1;i<=k;i++){
            for(j=1;j<=10;j++){
                if((i>=4&&i<=6)&&(j>=4)){
                    System.out.print(" ");
                }
                else if((i>=10&&i<=12)&&(j<=7)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("O");
                }
            }
            System.out.println();
        }
    }                        
}
