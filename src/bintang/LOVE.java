package bintang;
import java.util.Scanner;
public class LOVE {
    public static void main(String args[]) {       
        int i;
        int love;
        int you;
         Scanner input=new Scanner(System.in);         
         System.out.println("-----------------------------------");
         System.out.println("                LOVE               ");
         System.out.println("-----------------------------------");
         System.out.print("Masukkan Angka Yang Diinginkan : ");
         you=input.nextInt();        
        for (i=you/2;i<=you;i+=2){                    
            for(love=1;love<you-i;love+=2){        
                System.out.print(" ");
    }
    for (love=1;love<=i;love++){
        System.out.print("O");
    }
    for(love=1;love<=you-i;love++){
        System.out.print(" ");
    }
        for (love=1;love<=i;love++){
                        
        System.out.print("O");
        }
        System.out.println();
    }
        for (i=you;i>=1;i--){
            for (love=i;love<you;love++){
                System.out.print(" ");                
            }
            for (love=1;love<=(i*2)-1;love++){
                System.out.print("O");
            }
        System.out.println();
}
    }
        }


