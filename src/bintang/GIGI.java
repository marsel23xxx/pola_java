package bintang;
import java.util.Scanner;
public class GIGI {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int tinggi=4;
        int j,i,n,lebar;
        int num=tinggi+1;
        int spasi=(num*3+2)-(num+3);
        int inc=1;
        int x=0;
        System.out.println("---------------------------------");
        System.out.println("       MEMBUAT ANGKA OMPONG      ");
        System.out.println("---------------------------------");
        System.out.print("Masukkan Nilai Lebar : ");
        lebar=sc.nextInt();
        for(i=1;i<=tinggi;i++){
            for(j=1;j<=lebar;j++){
                if(i != tinggi){
                    System.out.print("   ");
                }
                else{
                    System.out.printf(":D ",(num-1));
                }
                for(n=1;n<=4;n++){
                    if(i==1||n==1||n==4){
                        System.out.printf(":D ",(num));
                        num =num + inc;
                    }
                    else{
                        System.out.print("   ");
                    }
                }
                num = num-inc;
                if(i !=tinggi){
                    System.out.print("   ");
                }
                else{
                    System.out.printf(":D ",(num+1));
                }
                num+=spasi;
            }
            spasi-=2;
            inc=5+x;
            x+=2;
            num = tinggi-i+1;
                    System.out.println("");
        }
        
    }
    
}
