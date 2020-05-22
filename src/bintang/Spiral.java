package bintang;
import java.util.Scanner;
public class Spiral {
    public static void main(String args []){
        Scanner input=new Scanner(System.in);
        int lebar;
        int tinggi=5;
        int zaka,S,Kom;
        System.out.println("--------------------------------");
        System.out.println("        MENCOBA SPIRAL          ");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Nilai Lebar : ");
        lebar=input.nextInt();
        for(zaka=1;zaka<=tinggi;zaka++){
            for(S=1;S<=lebar;S++){
        for(Kom=1;Kom<=tinggi;Kom++){
             if(zaka==Kom||zaka+Kom==tinggi+1){
                        System.out.print(":D");
                    }
                        else{
                        System.out.print("  ");
                       }
                    }
                }
                        System.out.println();
            }
        }
    }
    
