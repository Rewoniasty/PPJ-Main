public class Zad102 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int size = scan.nextInt();
        if (size%2 == 1){
            for(int k=0;k<size;k++){
                for(int i=0;i<size;i++){
                    System.out.print("*");
                }
                System.out.print(" ");
                for(int i=0;i<size;i++){
                    if (i == 0 || i == size-1 || k==0 || k==size-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        scan.close();
    }
}
