package bintang;
public class BentukT_Kanan {
    public static void main(String args []){        
        int i,j;
        System.out.println("--------------------------------");
        System.out.println("     MENCOBA BENTUK T KANAN     ");
        System.out.println("--------------------------------");        
        for(i=1;i<=10;i++){
            for(j=1;j<=10;j++){
                if(j==10||i==5){
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
