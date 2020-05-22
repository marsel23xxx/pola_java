package bintang;
import java.util.Scanner;
public class ULAR_BINTANG {
    public static void main(String args []){
        Scanner Sc=new Scanner(System.in);
        int lebar;
        int tinggi=5;
        int i,j,k;
        int is=1;
        int os=2;
        int jml = 1;
        int jump=(tinggi*3)-(tinggi+1);
        int num=tinggi;
        System.out.println("---------------------------------");
        System.out.println("       MENCOBA ULAR BINTANG      ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan nilai lebar : ");
        lebar=Sc.nextInt();
        for(i=1;i<=tinggi;i++){
            for(j=1;j<=lebar;j++){
                for(k=1;k<=os;k++){
                    
                System.out.print(" ");
            }
                System.out.printf(":D");
                for(k=1;k<=is;k++){
                    System.out.print(" ");
                }
                num+=jml;
                System.out.printf(":D");
                for(k=1;k<=os;k++){
                    System.out.print(" ");
                }
                System.out.print(" ");
                num+=jump;
            }
            os=((i+1)!=tinggi)?1:0;
            is=(i+1!=tinggi)?3:5;
            num =tinggi-i;
            jml=jml+2;
            jump-=2;
            System.out.println(" ");
        }
    }
}
