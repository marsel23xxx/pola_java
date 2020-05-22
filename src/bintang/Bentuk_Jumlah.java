package bintang;
public class Bentuk_Jumlah {
    public static void main(String args []){
        int i,j;
        System.out.println("--------------------------------");
        System.out.println("     MENCOBA BENTUK TAMBAH      ");
        System.out.println("--------------------------------");
        for(i=1;i<=9;i++){
            for(j=1;j<=9;j++){
                if(j==5||i==5){
                    System.out.print("O ");
                }
                else{
                    System.out.print("  ");
                }
            }
               System.out.print("\n");
        }
    }    
}
